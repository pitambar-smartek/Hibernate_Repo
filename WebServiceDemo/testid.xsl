<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:rootns="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01"
	xmlns:oper="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/AsyncExecuteDiagnosticsResult/OperationalAnalysis"
	xmlns:par="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/AsyncExecuteDiagnosticsResult/Parties"
	xmlns:user="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/AsyncExecuteDiagnosticsResult/Users"
	xmlns:ser="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/AsyncExecuteDiagnosticsResult/Services"
	xmlns:int="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/AsyncExecuteDiagnosticsResult/Interaction"
	xmlns:ns="http://capabilities.nat.bt.com/wsdl/ManageAssociation/2006/02"
	xmlns:int1="http://capabilities.nat.bt.com/wsdl/ManageAssociation/2006/02/Interaction"
	xmlns:char="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/AsyncExecuteDiagnosticsResult/CoreClasses/EnumeratedClasses/CharacteristicEnumerations"
	xmlns:rrt="http://capabilities.nat.bt.com/wsdl/ManageAssociation/2006/02/RRT_OR_RESPONSE_V1">

	<xsl:template match="/">
		<xsl:element name="getTestResultByTestIdResponse"
			namespace="http://afm.nat.bt.com/linetest/types" xmlns:n1="http://afm.nat.bt.com/linetest/types">
			<xsl:element name="responseStatus">
				Success
			</xsl:element>
			<xsl:call-template name="testInstance"></xsl:call-template>
		</xsl:element>
	</xsl:template>



	<xsl:template name="testInstance">
		<xsl:element name="n1:testInstance">
			<xsl:element name="n2:testConductorId"
				xmlns:n2="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/GetTestResultByTestIdResponse/OperationalAnalysis">
				<xsl:element name="n3:id"
					xmlns:n3="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/GetTestResultByTestIdResponse/Parties">

					<xsl:value-of select="/rootns:testInstance/oper:testConductorId/par:id"></xsl:value-of>
				</xsl:element>

			</xsl:element>

			<xsl:element name="n4:id"
				xmlns:n4="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/GetTestResultByTestIdResponse/OperationalAnalysis">


				<xsl:value-of select="/rootns:testInstance/oper:id"></xsl:value-of>


			</xsl:element>

			<xsl:element name="n5:tarrId"
				xmlns:n5="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/GetTestResultByTestIdResponse/OperationalAnalysis">
				<xsl:element name="n5:tarrId">
					<xsl:value-of select="/rootns:testInstance/oper:tarrId/oper:tarrId"></xsl:value-of>
				</xsl:element>
			</xsl:element>

			<xsl:element name="n6:testId"
				xmlns:n6="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/GetTestResultByTestIdResponse/OperationalAnalysis">
				<xsl:element name="n6:id">
					<xsl:value-of select="/rootns:testInstance/oper:testId/oper:id"></xsl:value-of>
				</xsl:element>
			</xsl:element>

			<xsl:element name="n7:userId"
				xmlns:n7="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/GetTestResultByTestIdResponse/OperationalAnalysis">
				<xsl:element name="n8:value" xmlns:n8="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/GetTestResultByTestIdResponse/Users">
					<xsl:value-of select="/rootns:testInstance/oper:userId/user:value"></xsl:value-of>
				</xsl:element>

			</xsl:element>

			<xsl:element name="n9:testInstanceResultList"
				xmlns:n9="http://capabilities.nat.bt.com/xsd/ManageNetworkAndServiceDiagnostics/2007/08/01/CCM/GetTestResultByTestIdResponse/OperationalAnalysis">
                <xsl:for-each select="/rootns:testInstance/oper:testInstanceResult">
                
				<xsl:copy-of select="/rootns:testInstance/oper:testInstanceResult">
				</xsl:copy-of>
				</xsl:for-each>

			</xsl:element>

		</xsl:element>




	</xsl:template>


</xsl:stylesheet>

