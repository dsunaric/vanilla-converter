//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.05.15 um 07:06:23 PM CEST 
//


package xml;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Activity_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "activity");
    private final static QName _AdHocSubProcess_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "adHocSubProcess");
    private final static QName _FlowElement_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "flowElement");
    private final static QName _Artifact_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact");
    private final static QName _Association_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "association");
    private final static QName _BaseElement_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "baseElement");
    private final static QName _BaseElementWithMixedContent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "baseElementWithMixedContent");
    private final static QName _BoundaryEvent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "boundaryEvent");
    private final static QName _BusinessRuleTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "businessRuleTask");
    private final static QName _CallableElement_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callableElement");
    private final static QName _CallActivity_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callActivity");
    private final static QName _CallChoreography_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callChoreography");
    private final static QName _CallConversation_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callConversation");
    private final static QName _ConversationNode_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationNode");
    private final static QName _CancelEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "cancelEventDefinition");
    private final static QName _EventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventDefinition");
    private final static QName _RootElement_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "rootElement");
    private final static QName _CatchEvent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "catchEvent");
    private final static QName _Category_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "category");
    private final static QName _Choreography_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreography");
    private final static QName _Collaboration_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "collaboration");
    private final static QName _ChoreographyActivity_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreographyActivity");
    private final static QName _ChoreographyTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreographyTask");
    private final static QName _CompensateEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "compensateEventDefinition");
    private final static QName _ComplexGateway_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "complexGateway");
    private final static QName _ConditionalEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conditionalEventDefinition");
    private final static QName _Conversation_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversation");
    private final static QName _CorrelationProperty_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationProperty");
    private final static QName _DataAssociation_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataAssociation");
    private final static QName _DataObject_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataObject");
    private final static QName _DataObjectReference_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataObjectReference");
    private final static QName _DataStore_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataStore");
    private final static QName _DataStoreReference_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataStoreReference");
    private final static QName _EndEvent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "endEvent");
    private final static QName _EndPoint_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "endPoint");
    private final static QName _Error_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "error");
    private final static QName _ErrorEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "errorEventDefinition");
    private final static QName _Escalation_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "escalation");
    private final static QName _EscalationEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "escalationEventDefinition");
    private final static QName _Event_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "event");
    private final static QName _EventBasedGateway_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventBasedGateway");
    private final static QName _ExclusiveGateway_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "exclusiveGateway");
    private final static QName _Expression_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "expression");
    private final static QName _FlowNode_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "flowNode");
    private final static QName _FormalExpression_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "formalExpression");
    private final static QName _Gateway_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "gateway");
    private final static QName _GlobalBusinessRuleTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalBusinessRuleTask");
    private final static QName _GlobalChoreographyTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalChoreographyTask");
    private final static QName _GlobalConversation_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalConversation");
    private final static QName _GlobalManualTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalManualTask");
    private final static QName _GlobalScriptTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalScriptTask");
    private final static QName _GlobalTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalTask");
    private final static QName _GlobalUserTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalUserTask");
    private final static QName _Group_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "group");
    private final static QName _HumanPerformer_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "humanPerformer");
    private final static QName _Performer_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "performer");
    private final static QName _ResourceRole_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRole");
    private final static QName _ImplicitThrowEvent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "implicitThrowEvent");
    private final static QName _InclusiveGateway_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inclusiveGateway");
    private final static QName _Interface_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "interface");
    private final static QName _IntermediateCatchEvent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "intermediateCatchEvent");
    private final static QName _IntermediateThrowEvent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "intermediateThrowEvent");
    private final static QName _ItemDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "itemDefinition");
    private final static QName _LinkEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "linkEventDefinition");
    private final static QName _LoopCharacteristics_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCharacteristics");
    private final static QName _ManualTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "manualTask");
    private final static QName _Message_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "message");
    private final static QName _MessageEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageEventDefinition");
    private final static QName _MultiInstanceLoopCharacteristics_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "multiInstanceLoopCharacteristics");
    private final static QName _ParallelGateway_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "parallelGateway");
    private final static QName _PartnerEntity_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "partnerEntity");
    private final static QName _PartnerRole_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "partnerRole");
    private final static QName _PotentialOwner_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "potentialOwner");
    private final static QName _Process_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "process");
    private final static QName _ReceiveTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "receiveTask");
    private final static QName _Resource_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resource");
    private final static QName _ScriptTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "scriptTask");
    private final static QName _SendTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "sendTask");
    private final static QName _SequenceFlow_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "sequenceFlow");
    private final static QName _ServiceTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "serviceTask");
    private final static QName _Signal_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "signal");
    private final static QName _SignalEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "signalEventDefinition");
    private final static QName _StandardLoopCharacteristics_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "standardLoopCharacteristics");
    private final static QName _StartEvent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "startEvent");
    private final static QName _SubChoreography_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subChoreography");
    private final static QName _SubConversation_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subConversation");
    private final static QName _SubProcess_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subProcess");
    private final static QName _Task_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "task");
    private final static QName _TerminateEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "terminateEventDefinition");
    private final static QName _TextAnnotation_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "textAnnotation");
    private final static QName _ThrowEvent_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "throwEvent");
    private final static QName _TimerEventDefinition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timerEventDefinition");
    private final static QName _Transaction_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "transaction");
    private final static QName _UserTask_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "userTask");
    private final static QName _DiagramElement_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "DiagramElement");
    private final static QName _BPMNShape_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNShape");
    private final static QName _BPMNEdge_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNEdge");
    private final static QName _Diagram_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "Diagram");
    private final static QName _Style_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "Style");
    private final static QName _Node_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "Node");
    private final static QName _Edge_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "Edge");
    private final static QName _Shape_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "Shape");
    private final static QName _Plane_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "Plane");
    private final static QName _LabeledEdge_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "LabeledEdge");
    private final static QName _Label_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "Label");
    private final static QName _LabeledShape_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "LabeledShape");
    private final static QName _AssignmentFrom_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "from");
    private final static QName _AssignmentTo_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "to");
    private final static QName _ComplexBehaviorDefinitionCondition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "condition");
    private final static QName _CorrelationKeyCorrelationPropertyRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationPropertyRef");
    private final static QName _CorrelationPropertyBindingDataPath_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataPath");
    private final static QName _CorrelationPropertyRetrievalExpressionMessagePath_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messagePath");
    private final static QName _TDataAssociationSourceRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "sourceRef");
    private final static QName _TDataAssociationTargetRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "targetRef");
    private final static QName _TDataAssociationTransformation_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "transformation");
    private final static QName _InputSetDataInputRefs_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataInputRefs");
    private final static QName _InputSetOptionalInputRefs_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "optionalInputRefs");
    private final static QName _InputSetWhileExecutingInputRefs_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "whileExecutingInputRefs");
    private final static QName _InputSetOutputSetRefs_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "outputSetRefs");
    private final static QName _OutputSetDataOutputRefs_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataOutputRefs");
    private final static QName _OutputSetOptionalOutputRefs_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "optionalOutputRefs");
    private final static QName _OutputSetWhileExecutingOutputRefs_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "whileExecutingOutputRefs");
    private final static QName _OutputSetInputSetRefs_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inputSetRefs");
    private final static QName _LanePartitionElement_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "partitionElement");
    private final static QName _LaneFlowNodeRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "flowNodeRef");
    private final static QName _LaneChildLaneSet_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "childLaneSet");
    private final static QName _OperationInMessageRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inMessageRef");
    private final static QName _OperationOutMessageRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "outMessageRef");
    private final static QName _OperationErrorRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "errorRef");
    private final static QName _ParticipantInterfaceRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "interfaceRef");
    private final static QName _ParticipantEndPointRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "endPointRef");
    private final static QName _ParticipantAssociationInnerParticipantRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "innerParticipantRef");
    private final static QName _ParticipantAssociationOuterParticipantRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "outerParticipantRef");
    private final static QName _RelationshipSource_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "source");
    private final static QName _RelationshipTarget_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "target");
    private final static QName _DiagramElementExtension_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "extension");
    private final static QName _ModelerExecutionPlatform_QNAME = new QName("http://camunda.org/schema/modeler/1.0", "executionPlatform");
    private final static QName _ModelerExecutionPlatformVersion_QNAME = new QName("http://camunda.org/schema/modeler/1.0", "executionPlatformVersion");
    private final static QName _ZeebeTaskDefinition_QNAME = new QName("http://camunda.org/schema/zeebe/1.0", "taskDefinition");
    private final static QName _ZeebeInput_QNAME = new QName("http://camunda.org/schema/zeebe/1.0", "input");
    private final static QName _ZeebeOutput_QNAME = new QName("http://camunda.org/schema/zeebe/1.0", "output");
    private final static QName _ZeebeSubscription_QNAME = new QName("http://camunda.org/schema/zeebe/1.0", "subscription");
    private final static QName _ZeebeCalledDecision_QNAME = new QName("http://camunda.org/schema/zeebe/1.0", "calledDecision");
    private final static QName _FieldTypeExpression_QNAME = new QName("http://camunda.org/schema/1.0/bpmn", "expression");
    private final static QName _FieldTypeString_QNAME = new QName("http://camunda.org/schema/1.0/bpmn", "string");
    private final static QName _PropertiesTypeProperty_QNAME = new QName("http://camunda.org/schema/1.0/bpmn", "property");
    private final static QName _TaskListenerTypeField_QNAME = new QName("http://camunda.org/schema/1.0/bpmn", "field");
    private final static QName _InputOutputTypeInputParameter_QNAME = new QName("http://camunda.org/schema/1.0/bpmn", "inputParameter");
    private final static QName _InputOutputTypeOutputParameter_QNAME = new QName("http://camunda.org/schema/1.0/bpmn", "outputParameter");
    private final static QName _EdgeWaypoint_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DI", "waypoint");
    private final static QName _TFlowElementCategoryValueRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "categoryValueRef");
    private final static QName _TFlowNodeIncoming_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "incoming");
    private final static QName _TFlowNodeOutgoing_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "outgoing");
    private final static QName _TTimerEventDefinitionTimeCycle_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timeCycle");
    private final static QName _TTimerEventDefinitionTimeDuration_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timeDuration");
    private final static QName _TTimerEventDefinitionTimeDate_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timeDate");
    private final static QName _TThrowEventEventDefinitionRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventDefinitionRef");
    private final static QName _TConversationNodeParticipantRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participantRef");
    private final static QName _TConversationNodeMessageFlowRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageFlowRef");
    private final static QName _TStandardLoopCharacteristicsLoopCondition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCondition");
    private final static QName _TSequenceFlowConditionExpression_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conditionExpression");
    private final static QName _TCallableElementSupportedInterfaceRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "supportedInterfaceRef");
    private final static QName _TProcessSupports_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "supports");
    private final static QName _TResourceRoleResourceRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRef");
    private final static QName _TMultiInstanceLoopCharacteristicsLoopCardinality_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCardinality");
    private final static QName _TMultiInstanceLoopCharacteristicsLoopDataInputRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopDataInputRef");
    private final static QName _TMultiInstanceLoopCharacteristicsLoopDataOutputRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopDataOutputRef");
    private final static QName _TMultiInstanceLoopCharacteristicsInputDataItem_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inputDataItem");
    private final static QName _TMultiInstanceLoopCharacteristicsOutputDataItem_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "outputDataItem");
    private final static QName _TMultiInstanceLoopCharacteristicsCompletionCondition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "completionCondition");
    private final static QName _TMessageEventDefinitionOperationRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "operationRef");
    private final static QName _TCollaborationChoreographyRef_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreographyRef");
    private final static QName _TComplexGatewayActivationCondition_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "activationCondition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TAdHocSubProcess }
     * 
     */
    public TAdHocSubProcess createTAdHocSubProcess() {
        return new TAdHocSubProcess();
    }

    /**
     * Create an instance of {@link Assignment }
     * 
     */
    public Assignment createAssignment() {
        return new Assignment();
    }

    /**
     * Create an instance of {@link Documentation }
     * 
     */
    public Documentation createDocumentation() {
        return new Documentation();
    }

    /**
     * Create an instance of {@link ExtensionElements }
     * 
     */
    public ExtensionElements createExtensionElements() {
        return new ExtensionElements();
    }

    /**
     * Create an instance of {@link TExpression }
     * 
     */
    public TExpression createTExpression() {
        return new TExpression();
    }

    /**
     * Create an instance of {@link TAssociation }
     * 
     */
    public TAssociation createTAssociation() {
        return new TAssociation();
    }

    /**
     * Create an instance of {@link Auditing }
     * 
     */
    public Auditing createAuditing() {
        return new Auditing();
    }

    /**
     * Create an instance of {@link TBoundaryEvent }
     * 
     */
    public TBoundaryEvent createTBoundaryEvent() {
        return new TBoundaryEvent();
    }

    /**
     * Create an instance of {@link TBusinessRuleTask }
     * 
     */
    public TBusinessRuleTask createTBusinessRuleTask() {
        return new TBusinessRuleTask();
    }

    /**
     * Create an instance of {@link TCallableElement }
     * 
     */
    public TCallableElement createTCallableElement() {
        return new TCallableElement();
    }

    /**
     * Create an instance of {@link TCallActivity }
     * 
     */
    public TCallActivity createTCallActivity() {
        return new TCallActivity();
    }

    /**
     * Create an instance of {@link TCallChoreography }
     * 
     */
    public TCallChoreography createTCallChoreography() {
        return new TCallChoreography();
    }

    /**
     * Create an instance of {@link TCallConversation }
     * 
     */
    public TCallConversation createTCallConversation() {
        return new TCallConversation();
    }

    /**
     * Create an instance of {@link TCancelEventDefinition }
     * 
     */
    public TCancelEventDefinition createTCancelEventDefinition() {
        return new TCancelEventDefinition();
    }

    /**
     * Create an instance of {@link TCategory }
     * 
     */
    public TCategory createTCategory() {
        return new TCategory();
    }

    /**
     * Create an instance of {@link CategoryValue }
     * 
     */
    public CategoryValue createCategoryValue() {
        return new CategoryValue();
    }

    /**
     * Create an instance of {@link TChoreography }
     * 
     */
    public TChoreography createTChoreography() {
        return new TChoreography();
    }

    /**
     * Create an instance of {@link TCollaboration }
     * 
     */
    public TCollaboration createTCollaboration() {
        return new TCollaboration();
    }

    /**
     * Create an instance of {@link TChoreographyTask }
     * 
     */
    public TChoreographyTask createTChoreographyTask() {
        return new TChoreographyTask();
    }

    /**
     * Create an instance of {@link TCompensateEventDefinition }
     * 
     */
    public TCompensateEventDefinition createTCompensateEventDefinition() {
        return new TCompensateEventDefinition();
    }

    /**
     * Create an instance of {@link ComplexBehaviorDefinition }
     * 
     */
    public ComplexBehaviorDefinition createComplexBehaviorDefinition() {
        return new ComplexBehaviorDefinition();
    }

    /**
     * Create an instance of {@link TFormalExpression }
     * 
     */
    public TFormalExpression createTFormalExpression() {
        return new TFormalExpression();
    }

    /**
     * Create an instance of {@link TImplicitThrowEvent }
     * 
     */
    public TImplicitThrowEvent createTImplicitThrowEvent() {
        return new TImplicitThrowEvent();
    }

    /**
     * Create an instance of {@link TComplexGateway }
     * 
     */
    public TComplexGateway createTComplexGateway() {
        return new TComplexGateway();
    }

    /**
     * Create an instance of {@link TConditionalEventDefinition }
     * 
     */
    public TConditionalEventDefinition createTConditionalEventDefinition() {
        return new TConditionalEventDefinition();
    }

    /**
     * Create an instance of {@link TConversation }
     * 
     */
    public TConversation createTConversation() {
        return new TConversation();
    }

    /**
     * Create an instance of {@link ConversationAssociation }
     * 
     */
    public ConversationAssociation createConversationAssociation() {
        return new ConversationAssociation();
    }

    /**
     * Create an instance of {@link ConversationLink }
     * 
     */
    public ConversationLink createConversationLink() {
        return new ConversationLink();
    }

    /**
     * Create an instance of {@link CorrelationKey }
     * 
     */
    public CorrelationKey createCorrelationKey() {
        return new CorrelationKey();
    }

    /**
     * Create an instance of {@link TCorrelationProperty }
     * 
     */
    public TCorrelationProperty createTCorrelationProperty() {
        return new TCorrelationProperty();
    }

    /**
     * Create an instance of {@link CorrelationPropertyBinding }
     * 
     */
    public CorrelationPropertyBinding createCorrelationPropertyBinding() {
        return new CorrelationPropertyBinding();
    }

    /**
     * Create an instance of {@link CorrelationPropertyRetrievalExpression }
     * 
     */
    public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
        return new CorrelationPropertyRetrievalExpression();
    }

    /**
     * Create an instance of {@link CorrelationSubscription }
     * 
     */
    public CorrelationSubscription createCorrelationSubscription() {
        return new CorrelationSubscription();
    }

    /**
     * Create an instance of {@link TDataAssociation }
     * 
     */
    public TDataAssociation createTDataAssociation() {
        return new TDataAssociation();
    }

    /**
     * Create an instance of {@link DataInput }
     * 
     */
    public DataInput createDataInput() {
        return new DataInput();
    }

    /**
     * Create an instance of {@link DataState }
     * 
     */
    public DataState createDataState() {
        return new DataState();
    }

    /**
     * Create an instance of {@link DataInputAssociation }
     * 
     */
    public DataInputAssociation createDataInputAssociation() {
        return new DataInputAssociation();
    }

    /**
     * Create an instance of {@link TDataObject }
     * 
     */
    public TDataObject createTDataObject() {
        return new TDataObject();
    }

    /**
     * Create an instance of {@link TDataObjectReference }
     * 
     */
    public TDataObjectReference createTDataObjectReference() {
        return new TDataObjectReference();
    }

    /**
     * Create an instance of {@link DataOutput }
     * 
     */
    public DataOutput createDataOutput() {
        return new DataOutput();
    }

    /**
     * Create an instance of {@link DataOutputAssociation }
     * 
     */
    public DataOutputAssociation createDataOutputAssociation() {
        return new DataOutputAssociation();
    }

    /**
     * Create an instance of {@link TDataStore }
     * 
     */
    public TDataStore createTDataStore() {
        return new TDataStore();
    }

    /**
     * Create an instance of {@link TDataStoreReference }
     * 
     */
    public TDataStoreReference createTDataStoreReference() {
        return new TDataStoreReference();
    }

    /**
     * Create an instance of {@link TEndEvent }
     * 
     */
    public TEndEvent createTEndEvent() {
        return new TEndEvent();
    }

    /**
     * Create an instance of {@link TEndPoint }
     * 
     */
    public TEndPoint createTEndPoint() {
        return new TEndPoint();
    }

    /**
     * Create an instance of {@link TError }
     * 
     */
    public TError createTError() {
        return new TError();
    }

    /**
     * Create an instance of {@link TErrorEventDefinition }
     * 
     */
    public TErrorEventDefinition createTErrorEventDefinition() {
        return new TErrorEventDefinition();
    }

    /**
     * Create an instance of {@link TEscalation }
     * 
     */
    public TEscalation createTEscalation() {
        return new TEscalation();
    }

    /**
     * Create an instance of {@link TEscalationEventDefinition }
     * 
     */
    public TEscalationEventDefinition createTEscalationEventDefinition() {
        return new TEscalationEventDefinition();
    }

    /**
     * Create an instance of {@link TEventBasedGateway }
     * 
     */
    public TEventBasedGateway createTEventBasedGateway() {
        return new TEventBasedGateway();
    }

    /**
     * Create an instance of {@link TExclusiveGateway }
     * 
     */
    public TExclusiveGateway createTExclusiveGateway() {
        return new TExclusiveGateway();
    }

    /**
     * Create an instance of {@link xml.Extension }
     * 
     */
    public xml.Extension createExtension() {
        return new xml.Extension();
    }

    /**
     * Create an instance of {@link TGateway }
     * 
     */
    public TGateway createTGateway() {
        return new TGateway();
    }

    /**
     * Create an instance of {@link TGlobalBusinessRuleTask }
     * 
     */
    public TGlobalBusinessRuleTask createTGlobalBusinessRuleTask() {
        return new TGlobalBusinessRuleTask();
    }

    /**
     * Create an instance of {@link TGlobalChoreographyTask }
     * 
     */
    public TGlobalChoreographyTask createTGlobalChoreographyTask() {
        return new TGlobalChoreographyTask();
    }

    /**
     * Create an instance of {@link TGlobalConversation }
     * 
     */
    public TGlobalConversation createTGlobalConversation() {
        return new TGlobalConversation();
    }

    /**
     * Create an instance of {@link TGlobalManualTask }
     * 
     */
    public TGlobalManualTask createTGlobalManualTask() {
        return new TGlobalManualTask();
    }

    /**
     * Create an instance of {@link TGlobalScriptTask }
     * 
     */
    public TGlobalScriptTask createTGlobalScriptTask() {
        return new TGlobalScriptTask();
    }

    /**
     * Create an instance of {@link TGlobalTask }
     * 
     */
    public TGlobalTask createTGlobalTask() {
        return new TGlobalTask();
    }

    /**
     * Create an instance of {@link TGlobalUserTask }
     * 
     */
    public TGlobalUserTask createTGlobalUserTask() {
        return new TGlobalUserTask();
    }

    /**
     * Create an instance of {@link TGroup }
     * 
     */
    public TGroup createTGroup() {
        return new TGroup();
    }

    /**
     * Create an instance of {@link THumanPerformer }
     * 
     */
    public THumanPerformer createTHumanPerformer() {
        return new THumanPerformer();
    }

    /**
     * Create an instance of {@link TPerformer }
     * 
     */
    public TPerformer createTPerformer() {
        return new TPerformer();
    }

    /**
     * Create an instance of {@link TResourceRole }
     * 
     */
    public TResourceRole createTResourceRole() {
        return new TResourceRole();
    }

    /**
     * Create an instance of {@link TInclusiveGateway }
     * 
     */
    public TInclusiveGateway createTInclusiveGateway() {
        return new TInclusiveGateway();
    }

    /**
     * Create an instance of {@link InputSet }
     * 
     */
    public InputSet createInputSet() {
        return new InputSet();
    }

    /**
     * Create an instance of {@link TInterface }
     * 
     */
    public TInterface createTInterface() {
        return new TInterface();
    }

    /**
     * Create an instance of {@link TIntermediateCatchEvent }
     * 
     */
    public TIntermediateCatchEvent createTIntermediateCatchEvent() {
        return new TIntermediateCatchEvent();
    }

    /**
     * Create an instance of {@link TIntermediateThrowEvent }
     * 
     */
    public TIntermediateThrowEvent createTIntermediateThrowEvent() {
        return new TIntermediateThrowEvent();
    }

    /**
     * Create an instance of {@link IoBinding }
     * 
     */
    public IoBinding createIoBinding() {
        return new IoBinding();
    }

    /**
     * Create an instance of {@link IoSpecification }
     * 
     */
    public IoSpecification createIoSpecification() {
        return new IoSpecification();
    }

    /**
     * Create an instance of {@link OutputSet }
     * 
     */
    public OutputSet createOutputSet() {
        return new OutputSet();
    }

    /**
     * Create an instance of {@link TItemDefinition }
     * 
     */
    public TItemDefinition createTItemDefinition() {
        return new TItemDefinition();
    }

    /**
     * Create an instance of {@link Lane }
     * 
     */
    public Lane createLane() {
        return new Lane();
    }

    /**
     * Create an instance of {@link LaneSet }
     * 
     */
    public LaneSet createLaneSet() {
        return new LaneSet();
    }

    /**
     * Create an instance of {@link TLinkEventDefinition }
     * 
     */
    public TLinkEventDefinition createTLinkEventDefinition() {
        return new TLinkEventDefinition();
    }

    /**
     * Create an instance of {@link TManualTask }
     * 
     */
    public TManualTask createTManualTask() {
        return new TManualTask();
    }

    /**
     * Create an instance of {@link TMessage }
     * 
     */
    public TMessage createTMessage() {
        return new TMessage();
    }

    /**
     * Create an instance of {@link TMessageEventDefinition }
     * 
     */
    public TMessageEventDefinition createTMessageEventDefinition() {
        return new TMessageEventDefinition();
    }

    /**
     * Create an instance of {@link MessageFlow }
     * 
     */
    public MessageFlow createMessageFlow() {
        return new MessageFlow();
    }

    /**
     * Create an instance of {@link MessageFlowAssociation }
     * 
     */
    public MessageFlowAssociation createMessageFlowAssociation() {
        return new MessageFlowAssociation();
    }

    /**
     * Create an instance of {@link Monitoring }
     * 
     */
    public Monitoring createMonitoring() {
        return new Monitoring();
    }

    /**
     * Create an instance of {@link TMultiInstanceLoopCharacteristics }
     * 
     */
    public TMultiInstanceLoopCharacteristics createTMultiInstanceLoopCharacteristics() {
        return new TMultiInstanceLoopCharacteristics();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link TParallelGateway }
     * 
     */
    public TParallelGateway createTParallelGateway() {
        return new TParallelGateway();
    }

    /**
     * Create an instance of {@link Participant }
     * 
     */
    public Participant createParticipant() {
        return new Participant();
    }

    /**
     * Create an instance of {@link ParticipantMultiplicity }
     * 
     */
    public ParticipantMultiplicity createParticipantMultiplicity() {
        return new ParticipantMultiplicity();
    }

    /**
     * Create an instance of {@link ParticipantAssociation }
     * 
     */
    public ParticipantAssociation createParticipantAssociation() {
        return new ParticipantAssociation();
    }

    /**
     * Create an instance of {@link TPartnerEntity }
     * 
     */
    public TPartnerEntity createTPartnerEntity() {
        return new TPartnerEntity();
    }

    /**
     * Create an instance of {@link TPartnerRole }
     * 
     */
    public TPartnerRole createTPartnerRole() {
        return new TPartnerRole();
    }

    /**
     * Create an instance of {@link TPotentialOwner }
     * 
     */
    public TPotentialOwner createTPotentialOwner() {
        return new TPotentialOwner();
    }

    /**
     * Create an instance of {@link TProcess }
     * 
     */
    public TProcess createTProcess() {
        return new TProcess();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link TReceiveTask }
     * 
     */
    public TReceiveTask createTReceiveTask() {
        return new TReceiveTask();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link Rendering }
     * 
     */
    public Rendering createRendering() {
        return new Rendering();
    }

    /**
     * Create an instance of {@link TResource }
     * 
     */
    public TResource createTResource() {
        return new TResource();
    }

    /**
     * Create an instance of {@link ResourceAssignmentExpression }
     * 
     */
    public ResourceAssignmentExpression createResourceAssignmentExpression() {
        return new ResourceAssignmentExpression();
    }

    /**
     * Create an instance of {@link ResourceParameter }
     * 
     */
    public ResourceParameter createResourceParameter() {
        return new ResourceParameter();
    }

    /**
     * Create an instance of {@link ResourceParameterBinding }
     * 
     */
    public ResourceParameterBinding createResourceParameterBinding() {
        return new ResourceParameterBinding();
    }

    /**
     * Create an instance of {@link TScriptTask }
     * 
     */
    public TScriptTask createTScriptTask() {
        return new TScriptTask();
    }

    /**
     * Create an instance of {@link Script }
     * 
     */
    public Script createScript() {
        return new Script();
    }

    /**
     * Create an instance of {@link TSendTask }
     * 
     */
    public TSendTask createTSendTask() {
        return new TSendTask();
    }

    /**
     * Create an instance of {@link TSequenceFlow }
     * 
     */
    public TSequenceFlow createTSequenceFlow() {
        return new TSequenceFlow();
    }

    /**
     * Create an instance of {@link TServiceTask }
     * 
     */
    public TServiceTask createTServiceTask() {
        return new TServiceTask();
    }

    /**
     * Create an instance of {@link TSignal }
     * 
     */
    public TSignal createTSignal() {
        return new TSignal();
    }

    /**
     * Create an instance of {@link TSignalEventDefinition }
     * 
     */
    public TSignalEventDefinition createTSignalEventDefinition() {
        return new TSignalEventDefinition();
    }

    /**
     * Create an instance of {@link TStandardLoopCharacteristics }
     * 
     */
    public TStandardLoopCharacteristics createTStandardLoopCharacteristics() {
        return new TStandardLoopCharacteristics();
    }

    /**
     * Create an instance of {@link TStartEvent }
     * 
     */
    public TStartEvent createTStartEvent() {
        return new TStartEvent();
    }

    /**
     * Create an instance of {@link TSubChoreography }
     * 
     */
    public TSubChoreography createTSubChoreography() {
        return new TSubChoreography();
    }

    /**
     * Create an instance of {@link TSubConversation }
     * 
     */
    public TSubConversation createTSubConversation() {
        return new TSubConversation();
    }

    /**
     * Create an instance of {@link TSubProcess }
     * 
     */
    public TSubProcess createTSubProcess() {
        return new TSubProcess();
    }

    /**
     * Create an instance of {@link TTask }
     * 
     */
    public TTask createTTask() {
        return new TTask();
    }

    /**
     * Create an instance of {@link TTerminateEventDefinition }
     * 
     */
    public TTerminateEventDefinition createTTerminateEventDefinition() {
        return new TTerminateEventDefinition();
    }

    /**
     * Create an instance of {@link TTextAnnotation }
     * 
     */
    public TTextAnnotation createTTextAnnotation() {
        return new TTextAnnotation();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link TTimerEventDefinition }
     * 
     */
    public TTimerEventDefinition createTTimerEventDefinition() {
        return new TTimerEventDefinition();
    }

    /**
     * Create an instance of {@link TTransaction }
     * 
     */
    public TTransaction createTTransaction() {
        return new TTransaction();
    }

    /**
     * Create an instance of {@link TUserTask }
     * 
     */
    public TUserTask createTUserTask() {
        return new TUserTask();
    }

    /**
     * Create an instance of {@link Definitions }
     * 
     */
    public Definitions createDefinitions() {
        return new Definitions();
    }

    /**
     * Create an instance of {@link Import }
     * 
     */
    public Import createImport() {
        return new Import();
    }

    /**
     * Create an instance of {@link BPMNDiagram }
     * 
     */
    public BPMNDiagram createBPMNDiagram() {
        return new BPMNDiagram();
    }

    /**
     * Create an instance of {@link BPMNPlane }
     * 
     */
    public BPMNPlane createBPMNPlane() {
        return new BPMNPlane();
    }

    /**
     * Create an instance of {@link DiagramElement.Extension }
     * 
     */
    public DiagramElement.Extension createDiagramElementExtension() {
        return new DiagramElement.Extension();
    }

    /**
     * Create an instance of {@link BPMNLabelStyle }
     * 
     */
    public BPMNLabelStyle createBPMNLabelStyle() {
        return new BPMNLabelStyle();
    }

    /**
     * Create an instance of {@link Font }
     * 
     */
    public Font createFont() {
        return new Font();
    }

    /**
     * Create an instance of {@link BPMNShape }
     * 
     */
    public BPMNShape createBPMNShape() {
        return new BPMNShape();
    }

    /**
     * Create an instance of {@link BPMNLabel }
     * 
     */
    public BPMNLabel createBPMNLabel() {
        return new BPMNLabel();
    }

    /**
     * Create an instance of {@link Bounds }
     * 
     */
    public Bounds createBounds() {
        return new Bounds();
    }

    /**
     * Create an instance of {@link BPMNEdge }
     * 
     */
    public BPMNEdge createBPMNEdge() {
        return new BPMNEdge();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link Modeler }
     * 
     */
    public Modeler createModeler() {
        return new Modeler();
    }

    /**
     * Create an instance of {@link Zeebe }
     * 
     */
    public Zeebe createZeebe() {
        return new Zeebe();
    }

    /**
     * Create an instance of {@link TaskDefinition }
     * 
     */
    public TaskDefinition createTaskDefinition() {
        return new TaskDefinition();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link CalledDecision }
     * 
     */
    public CalledDecision createCalledDecision() {
        return new CalledDecision();
    }

    /**
     * Create an instance of {@link LoopCharacteristics }
     * 
     */
    public LoopCharacteristics createLoopCharacteristics() {
        return new LoopCharacteristics();
    }

    /**
     * Create an instance of {@link CalledElement }
     * 
     */
    public CalledElement createCalledElement() {
        return new CalledElement();
    }

    /**
     * Create an instance of {@link FormDefinition }
     * 
     */
    public FormDefinition createFormDefinition() {
        return new FormDefinition();
    }

    /**
     * Create an instance of {@link UserTask }
     * 
     */
    public UserTask createUserTask() {
        return new UserTask();
    }

    /**
     * Create an instance of {@link InputOutputType }
     * 
     */
    public InputOutputType createInputOutputType() {
        return new InputOutputType();
    }

    /**
     * Create an instance of {@link InputParameterType }
     * 
     */
    public InputParameterType createInputParameterType() {
        return new InputParameterType();
    }

    /**
     * Create an instance of {@link OutputParameterType }
     * 
     */
    public OutputParameterType createOutputParameterType() {
        return new OutputParameterType();
    }

    /**
     * Create an instance of {@link ExecutionListenerType }
     * 
     */
    public ExecutionListenerType createExecutionListenerType() {
        return new ExecutionListenerType();
    }

    /**
     * Create an instance of {@link TaskListenerType }
     * 
     */
    public TaskListenerType createTaskListenerType() {
        return new TaskListenerType();
    }

    /**
     * Create an instance of {@link PropertiesType }
     * 
     */
    public PropertiesType createPropertiesType() {
        return new PropertiesType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link FieldType }
     * 
     */
    public FieldType createFieldType() {
        return new FieldType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TActivity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TActivity }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "activity")
    public JAXBElement<TActivity> createActivity(TActivity value) {
        return new JAXBElement<TActivity>(_Activity_QNAME, TActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAdHocSubProcess }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TAdHocSubProcess }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "adHocSubProcess", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TAdHocSubProcess> createAdHocSubProcess(TAdHocSubProcess value) {
        return new JAXBElement<TAdHocSubProcess>(_AdHocSubProcess_QNAME, TAdHocSubProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFlowElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TFlowElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "flowElement")
    public JAXBElement<TFlowElement> createFlowElement(TFlowElement value) {
        return new JAXBElement<TFlowElement>(_FlowElement_QNAME, TFlowElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TArtifact }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TArtifact }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "artifact")
    public JAXBElement<TArtifact> createArtifact(TArtifact value) {
        return new JAXBElement<TArtifact>(_Artifact_QNAME, TArtifact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "association", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "artifact")
    public JAXBElement<TAssociation> createAssociation(TAssociation value) {
        return new JAXBElement<TAssociation>(_Association_QNAME, TAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TBaseElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TBaseElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "baseElement")
    public JAXBElement<TBaseElement> createBaseElement(TBaseElement value) {
        return new JAXBElement<TBaseElement>(_BaseElement_QNAME, TBaseElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TBaseElementWithMixedContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TBaseElementWithMixedContent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "baseElementWithMixedContent")
    public JAXBElement<TBaseElementWithMixedContent> createBaseElementWithMixedContent(TBaseElementWithMixedContent value) {
        return new JAXBElement<TBaseElementWithMixedContent>(_BaseElementWithMixedContent_QNAME, TBaseElementWithMixedContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TBoundaryEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TBoundaryEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "boundaryEvent", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TBoundaryEvent> createBoundaryEvent(TBoundaryEvent value) {
        return new JAXBElement<TBoundaryEvent>(_BoundaryEvent_QNAME, TBoundaryEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TBusinessRuleTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TBusinessRuleTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "businessRuleTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TBusinessRuleTask> createBusinessRuleTask(TBusinessRuleTask value) {
        return new JAXBElement<TBusinessRuleTask>(_BusinessRuleTask_QNAME, TBusinessRuleTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCallableElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCallableElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "callableElement")
    public JAXBElement<TCallableElement> createCallableElement(TCallableElement value) {
        return new JAXBElement<TCallableElement>(_CallableElement_QNAME, TCallableElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCallActivity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCallActivity }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "callActivity", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TCallActivity> createCallActivity(TCallActivity value) {
        return new JAXBElement<TCallActivity>(_CallActivity_QNAME, TCallActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCallChoreography }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCallChoreography }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "callChoreography", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TCallChoreography> createCallChoreography(TCallChoreography value) {
        return new JAXBElement<TCallChoreography>(_CallChoreography_QNAME, TCallChoreography.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCallConversation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCallConversation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "callConversation", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "conversationNode")
    public JAXBElement<TCallConversation> createCallConversation(TCallConversation value) {
        return new JAXBElement<TCallConversation>(_CallConversation_QNAME, TCallConversation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TConversationNode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TConversationNode }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "conversationNode")
    public JAXBElement<TConversationNode> createConversationNode(TConversationNode value) {
        return new JAXBElement<TConversationNode>(_ConversationNode_QNAME, TConversationNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCancelEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCancelEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "cancelEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TCancelEventDefinition> createCancelEventDefinition(TCancelEventDefinition value) {
        return new JAXBElement<TCancelEventDefinition>(_CancelEventDefinition_QNAME, TCancelEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "eventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TEventDefinition> createEventDefinition(TEventDefinition value) {
        return new JAXBElement<TEventDefinition>(_EventDefinition_QNAME, TEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRootElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TRootElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "rootElement")
    public JAXBElement<TRootElement> createRootElement(TRootElement value) {
        return new JAXBElement<TRootElement>(_RootElement_QNAME, TRootElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCatchEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCatchEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "catchEvent")
    public JAXBElement<TCatchEvent> createCatchEvent(TCatchEvent value) {
        return new JAXBElement<TCatchEvent>(_CatchEvent_QNAME, TCatchEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCategory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCategory }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "category", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TCategory> createCategory(TCategory value) {
        return new JAXBElement<TCategory>(_Category_QNAME, TCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TChoreography }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TChoreography }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "choreography", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "collaboration")
    public JAXBElement<TChoreography> createChoreography(TChoreography value) {
        return new JAXBElement<TChoreography>(_Choreography_QNAME, TChoreography.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCollaboration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCollaboration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "collaboration", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TCollaboration> createCollaboration(TCollaboration value) {
        return new JAXBElement<TCollaboration>(_Collaboration_QNAME, TCollaboration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TChoreographyActivity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TChoreographyActivity }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "choreographyActivity")
    public JAXBElement<TChoreographyActivity> createChoreographyActivity(TChoreographyActivity value) {
        return new JAXBElement<TChoreographyActivity>(_ChoreographyActivity_QNAME, TChoreographyActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TChoreographyTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TChoreographyTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "choreographyTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TChoreographyTask> createChoreographyTask(TChoreographyTask value) {
        return new JAXBElement<TChoreographyTask>(_ChoreographyTask_QNAME, TChoreographyTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCompensateEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCompensateEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "compensateEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TCompensateEventDefinition> createCompensateEventDefinition(TCompensateEventDefinition value) {
        return new JAXBElement<TCompensateEventDefinition>(_CompensateEventDefinition_QNAME, TCompensateEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TComplexGateway }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TComplexGateway }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "complexGateway", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TComplexGateway> createComplexGateway(TComplexGateway value) {
        return new JAXBElement<TComplexGateway>(_ComplexGateway_QNAME, TComplexGateway.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TConditionalEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TConditionalEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "conditionalEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TConditionalEventDefinition> createConditionalEventDefinition(TConditionalEventDefinition value) {
        return new JAXBElement<TConditionalEventDefinition>(_ConditionalEventDefinition_QNAME, TConditionalEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TConversation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TConversation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "conversation", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "conversationNode")
    public JAXBElement<TConversation> createConversation(TConversation value) {
        return new JAXBElement<TConversation>(_Conversation_QNAME, TConversation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCorrelationProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TCorrelationProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "correlationProperty", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TCorrelationProperty> createCorrelationProperty(TCorrelationProperty value) {
        return new JAXBElement<TCorrelationProperty>(_CorrelationProperty_QNAME, TCorrelationProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDataAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDataAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "dataAssociation")
    public JAXBElement<TDataAssociation> createDataAssociation(TDataAssociation value) {
        return new JAXBElement<TDataAssociation>(_DataAssociation_QNAME, TDataAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDataObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDataObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "dataObject", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TDataObject> createDataObject(TDataObject value) {
        return new JAXBElement<TDataObject>(_DataObject_QNAME, TDataObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDataObjectReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDataObjectReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "dataObjectReference", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TDataObjectReference> createDataObjectReference(TDataObjectReference value) {
        return new JAXBElement<TDataObjectReference>(_DataObjectReference_QNAME, TDataObjectReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDataStore }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDataStore }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "dataStore", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TDataStore> createDataStore(TDataStore value) {
        return new JAXBElement<TDataStore>(_DataStore_QNAME, TDataStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDataStoreReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDataStoreReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "dataStoreReference", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TDataStoreReference> createDataStoreReference(TDataStoreReference value) {
        return new JAXBElement<TDataStoreReference>(_DataStoreReference_QNAME, TDataStoreReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEndEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEndEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "endEvent", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TEndEvent> createEndEvent(TEndEvent value) {
        return new JAXBElement<TEndEvent>(_EndEvent_QNAME, TEndEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEndPoint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEndPoint }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "endPoint", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TEndPoint> createEndPoint(TEndPoint value) {
        return new JAXBElement<TEndPoint>(_EndPoint_QNAME, TEndPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TError }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "error", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TError> createError(TError value) {
        return new JAXBElement<TError>(_Error_QNAME, TError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TErrorEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TErrorEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "errorEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TErrorEventDefinition> createErrorEventDefinition(TErrorEventDefinition value) {
        return new JAXBElement<TErrorEventDefinition>(_ErrorEventDefinition_QNAME, TErrorEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEscalation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEscalation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "escalation", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TEscalation> createEscalation(TEscalation value) {
        return new JAXBElement<TEscalation>(_Escalation_QNAME, TEscalation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEscalationEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEscalationEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "escalationEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TEscalationEventDefinition> createEscalationEventDefinition(TEscalationEventDefinition value) {
        return new JAXBElement<TEscalationEventDefinition>(_EscalationEventDefinition_QNAME, TEscalationEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "event", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TEvent> createEvent(TEvent value) {
        return new JAXBElement<TEvent>(_Event_QNAME, TEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEventBasedGateway }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEventBasedGateway }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "eventBasedGateway", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TEventBasedGateway> createEventBasedGateway(TEventBasedGateway value) {
        return new JAXBElement<TEventBasedGateway>(_EventBasedGateway_QNAME, TEventBasedGateway.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExclusiveGateway }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExclusiveGateway }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "exclusiveGateway", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TExclusiveGateway> createExclusiveGateway(TExclusiveGateway value) {
        return new JAXBElement<TExclusiveGateway>(_ExclusiveGateway_QNAME, TExclusiveGateway.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "expression")
    public JAXBElement<TExpression> createExpression(TExpression value) {
        return new JAXBElement<TExpression>(_Expression_QNAME, TExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFlowNode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TFlowNode }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "flowNode")
    public JAXBElement<TFlowNode> createFlowNode(TFlowNode value) {
        return new JAXBElement<TFlowNode>(_FlowNode_QNAME, TFlowNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "formalExpression", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "expression")
    public JAXBElement<TFormalExpression> createFormalExpression(TFormalExpression value) {
        return new JAXBElement<TFormalExpression>(_FormalExpression_QNAME, TFormalExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGateway }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGateway }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "gateway")
    public JAXBElement<TGateway> createGateway(TGateway value) {
        return new JAXBElement<TGateway>(_Gateway_QNAME, TGateway.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGlobalBusinessRuleTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGlobalBusinessRuleTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "globalBusinessRuleTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TGlobalBusinessRuleTask> createGlobalBusinessRuleTask(TGlobalBusinessRuleTask value) {
        return new JAXBElement<TGlobalBusinessRuleTask>(_GlobalBusinessRuleTask_QNAME, TGlobalBusinessRuleTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGlobalChoreographyTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGlobalChoreographyTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "globalChoreographyTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "choreography")
    public JAXBElement<TGlobalChoreographyTask> createGlobalChoreographyTask(TGlobalChoreographyTask value) {
        return new JAXBElement<TGlobalChoreographyTask>(_GlobalChoreographyTask_QNAME, TGlobalChoreographyTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGlobalConversation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGlobalConversation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "globalConversation", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "collaboration")
    public JAXBElement<TGlobalConversation> createGlobalConversation(TGlobalConversation value) {
        return new JAXBElement<TGlobalConversation>(_GlobalConversation_QNAME, TGlobalConversation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGlobalManualTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGlobalManualTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "globalManualTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TGlobalManualTask> createGlobalManualTask(TGlobalManualTask value) {
        return new JAXBElement<TGlobalManualTask>(_GlobalManualTask_QNAME, TGlobalManualTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGlobalScriptTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGlobalScriptTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "globalScriptTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TGlobalScriptTask> createGlobalScriptTask(TGlobalScriptTask value) {
        return new JAXBElement<TGlobalScriptTask>(_GlobalScriptTask_QNAME, TGlobalScriptTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGlobalTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGlobalTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "globalTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TGlobalTask> createGlobalTask(TGlobalTask value) {
        return new JAXBElement<TGlobalTask>(_GlobalTask_QNAME, TGlobalTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGlobalUserTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGlobalUserTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "globalUserTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TGlobalUserTask> createGlobalUserTask(TGlobalUserTask value) {
        return new JAXBElement<TGlobalUserTask>(_GlobalUserTask_QNAME, TGlobalUserTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "group", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "artifact")
    public JAXBElement<TGroup> createGroup(TGroup value) {
        return new JAXBElement<TGroup>(_Group_QNAME, TGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link THumanPerformer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link THumanPerformer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "humanPerformer", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "performer")
    public JAXBElement<THumanPerformer> createHumanPerformer(THumanPerformer value) {
        return new JAXBElement<THumanPerformer>(_HumanPerformer_QNAME, THumanPerformer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPerformer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TPerformer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "performer", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "resourceRole")
    public JAXBElement<TPerformer> createPerformer(TPerformer value) {
        return new JAXBElement<TPerformer>(_Performer_QNAME, TPerformer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TResourceRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TResourceRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "resourceRole")
    public JAXBElement<TResourceRole> createResourceRole(TResourceRole value) {
        return new JAXBElement<TResourceRole>(_ResourceRole_QNAME, TResourceRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "implicitThrowEvent", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TImplicitThrowEvent> createImplicitThrowEvent(TImplicitThrowEvent value) {
        return new JAXBElement<TImplicitThrowEvent>(_ImplicitThrowEvent_QNAME, TImplicitThrowEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TInclusiveGateway }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TInclusiveGateway }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "inclusiveGateway", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TInclusiveGateway> createInclusiveGateway(TInclusiveGateway value) {
        return new JAXBElement<TInclusiveGateway>(_InclusiveGateway_QNAME, TInclusiveGateway.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TInterface }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TInterface }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "interface", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TInterface> createInterface(TInterface value) {
        return new JAXBElement<TInterface>(_Interface_QNAME, TInterface.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIntermediateCatchEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIntermediateCatchEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "intermediateCatchEvent", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TIntermediateCatchEvent> createIntermediateCatchEvent(TIntermediateCatchEvent value) {
        return new JAXBElement<TIntermediateCatchEvent>(_IntermediateCatchEvent_QNAME, TIntermediateCatchEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIntermediateThrowEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIntermediateThrowEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "intermediateThrowEvent", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TIntermediateThrowEvent> createIntermediateThrowEvent(TIntermediateThrowEvent value) {
        return new JAXBElement<TIntermediateThrowEvent>(_IntermediateThrowEvent_QNAME, TIntermediateThrowEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TItemDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TItemDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "itemDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TItemDefinition> createItemDefinition(TItemDefinition value) {
        return new JAXBElement<TItemDefinition>(_ItemDefinition_QNAME, TItemDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TLinkEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TLinkEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "linkEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TLinkEventDefinition> createLinkEventDefinition(TLinkEventDefinition value) {
        return new JAXBElement<TLinkEventDefinition>(_LinkEventDefinition_QNAME, TLinkEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TLoopCharacteristics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TLoopCharacteristics }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "loopCharacteristics")
    public JAXBElement<TLoopCharacteristics> createLoopCharacteristics(TLoopCharacteristics value) {
        return new JAXBElement<TLoopCharacteristics>(_LoopCharacteristics_QNAME, TLoopCharacteristics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TManualTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TManualTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "manualTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TManualTask> createManualTask(TManualTask value) {
        return new JAXBElement<TManualTask>(_ManualTask_QNAME, TManualTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "message", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TMessage> createMessage(TMessage value) {
        return new JAXBElement<TMessage>(_Message_QNAME, TMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessageEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMessageEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "messageEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TMessageEventDefinition> createMessageEventDefinition(TMessageEventDefinition value) {
        return new JAXBElement<TMessageEventDefinition>(_MessageEventDefinition_QNAME, TMessageEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMultiInstanceLoopCharacteristics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMultiInstanceLoopCharacteristics }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "multiInstanceLoopCharacteristics", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "loopCharacteristics")
    public JAXBElement<TMultiInstanceLoopCharacteristics> createMultiInstanceLoopCharacteristics(TMultiInstanceLoopCharacteristics value) {
        return new JAXBElement<TMultiInstanceLoopCharacteristics>(_MultiInstanceLoopCharacteristics_QNAME, TMultiInstanceLoopCharacteristics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TParallelGateway }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TParallelGateway }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "parallelGateway", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TParallelGateway> createParallelGateway(TParallelGateway value) {
        return new JAXBElement<TParallelGateway>(_ParallelGateway_QNAME, TParallelGateway.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPartnerEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TPartnerEntity }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "partnerEntity", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TPartnerEntity> createPartnerEntity(TPartnerEntity value) {
        return new JAXBElement<TPartnerEntity>(_PartnerEntity_QNAME, TPartnerEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPartnerRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TPartnerRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "partnerRole", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TPartnerRole> createPartnerRole(TPartnerRole value) {
        return new JAXBElement<TPartnerRole>(_PartnerRole_QNAME, TPartnerRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPotentialOwner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TPotentialOwner }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "potentialOwner", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "performer")
    public JAXBElement<TPotentialOwner> createPotentialOwner(TPotentialOwner value) {
        return new JAXBElement<TPotentialOwner>(_PotentialOwner_QNAME, TPotentialOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TProcess }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TProcess }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "process", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TProcess> createProcess(TProcess value) {
        return new JAXBElement<TProcess>(_Process_QNAME, TProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TReceiveTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TReceiveTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "receiveTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TReceiveTask> createReceiveTask(TReceiveTask value) {
        return new JAXBElement<TReceiveTask>(_ReceiveTask_QNAME, TReceiveTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TResource }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TResource }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "resource", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TResource> createResource(TResource value) {
        return new JAXBElement<TResource>(_Resource_QNAME, TResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TScriptTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TScriptTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "scriptTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TScriptTask> createScriptTask(TScriptTask value) {
        return new JAXBElement<TScriptTask>(_ScriptTask_QNAME, TScriptTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSendTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSendTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "sendTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TSendTask> createSendTask(TSendTask value) {
        return new JAXBElement<TSendTask>(_SendTask_QNAME, TSendTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSequenceFlow }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSequenceFlow }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "sequenceFlow", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TSequenceFlow> createSequenceFlow(TSequenceFlow value) {
        return new JAXBElement<TSequenceFlow>(_SequenceFlow_QNAME, TSequenceFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TServiceTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TServiceTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "serviceTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TServiceTask> createServiceTask(TServiceTask value) {
        return new JAXBElement<TServiceTask>(_ServiceTask_QNAME, TServiceTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSignal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSignal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "signal", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "rootElement")
    public JAXBElement<TSignal> createSignal(TSignal value) {
        return new JAXBElement<TSignal>(_Signal_QNAME, TSignal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSignalEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSignalEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "signalEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TSignalEventDefinition> createSignalEventDefinition(TSignalEventDefinition value) {
        return new JAXBElement<TSignalEventDefinition>(_SignalEventDefinition_QNAME, TSignalEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TStandardLoopCharacteristics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TStandardLoopCharacteristics }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "standardLoopCharacteristics", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "loopCharacteristics")
    public JAXBElement<TStandardLoopCharacteristics> createStandardLoopCharacteristics(TStandardLoopCharacteristics value) {
        return new JAXBElement<TStandardLoopCharacteristics>(_StandardLoopCharacteristics_QNAME, TStandardLoopCharacteristics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TStartEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TStartEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "startEvent", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TStartEvent> createStartEvent(TStartEvent value) {
        return new JAXBElement<TStartEvent>(_StartEvent_QNAME, TStartEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSubChoreography }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSubChoreography }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "subChoreography", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TSubChoreography> createSubChoreography(TSubChoreography value) {
        return new JAXBElement<TSubChoreography>(_SubChoreography_QNAME, TSubChoreography.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSubConversation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSubConversation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "subConversation", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "conversationNode")
    public JAXBElement<TSubConversation> createSubConversation(TSubConversation value) {
        return new JAXBElement<TSubConversation>(_SubConversation_QNAME, TSubConversation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSubProcess }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSubProcess }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "subProcess", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TSubProcess> createSubProcess(TSubProcess value) {
        return new JAXBElement<TSubProcess>(_SubProcess_QNAME, TSubProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "task", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TTask> createTask(TTask value) {
        return new JAXBElement<TTask>(_Task_QNAME, TTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTerminateEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TTerminateEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "terminateEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TTerminateEventDefinition> createTerminateEventDefinition(TTerminateEventDefinition value) {
        return new JAXBElement<TTerminateEventDefinition>(_TerminateEventDefinition_QNAME, TTerminateEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTextAnnotation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TTextAnnotation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "textAnnotation", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "artifact")
    public JAXBElement<TTextAnnotation> createTextAnnotation(TTextAnnotation value) {
        return new JAXBElement<TTextAnnotation>(_TextAnnotation_QNAME, TTextAnnotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TThrowEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TThrowEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "throwEvent")
    public JAXBElement<TThrowEvent> createThrowEvent(TThrowEvent value) {
        return new JAXBElement<TThrowEvent>(_ThrowEvent_QNAME, TThrowEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTimerEventDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TTimerEventDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "timerEventDefinition", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "eventDefinition")
    public JAXBElement<TTimerEventDefinition> createTimerEventDefinition(TTimerEventDefinition value) {
        return new JAXBElement<TTimerEventDefinition>(_TimerEventDefinition_QNAME, TTimerEventDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTransaction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TTransaction }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "transaction", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TTransaction> createTransaction(TTransaction value) {
        return new JAXBElement<TTransaction>(_Transaction_QNAME, TTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TUserTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TUserTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "userTask", substitutionHeadNamespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", substitutionHeadName = "flowElement")
    public JAXBElement<TUserTask> createUserTask(TUserTask value) {
        return new JAXBElement<TUserTask>(_UserTask_QNAME, TUserTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagramElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiagramElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "DiagramElement")
    public JAXBElement<DiagramElement> createDiagramElement(DiagramElement value) {
        return new JAXBElement<DiagramElement>(_DiagramElement_QNAME, DiagramElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BPMNShape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BPMNShape }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/DI", name = "BPMNShape", substitutionHeadNamespace = "http://www.omg.org/spec/DD/20100524/DI", substitutionHeadName = "DiagramElement")
    public JAXBElement<BPMNShape> createBPMNShape(BPMNShape value) {
        return new JAXBElement<BPMNShape>(_BPMNShape_QNAME, BPMNShape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BPMNEdge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BPMNEdge }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/DI", name = "BPMNEdge", substitutionHeadNamespace = "http://www.omg.org/spec/DD/20100524/DI", substitutionHeadName = "DiagramElement")
    public JAXBElement<BPMNEdge> createBPMNEdge(BPMNEdge value) {
        return new JAXBElement<BPMNEdge>(_BPMNEdge_QNAME, BPMNEdge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diagram }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Diagram }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "Diagram")
    public JAXBElement<Diagram> createDiagram(Diagram value) {
        return new JAXBElement<Diagram>(_Diagram_QNAME, Diagram.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Style }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Style }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "Style")
    public JAXBElement<Style> createStyle(Style value) {
        return new JAXBElement<Style>(_Style_QNAME, Style.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Node }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Node }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "Node")
    public JAXBElement<Node> createNode(Node value) {
        return new JAXBElement<Node>(_Node_QNAME, Node.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Edge }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "Edge")
    public JAXBElement<Edge> createEdge(Edge value) {
        return new JAXBElement<Edge>(_Edge_QNAME, Edge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Shape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Shape }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "Shape")
    public JAXBElement<Shape> createShape(Shape value) {
        return new JAXBElement<Shape>(_Shape_QNAME, Shape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Plane }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Plane }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "Plane")
    public JAXBElement<Plane> createPlane(Plane value) {
        return new JAXBElement<Plane>(_Plane_QNAME, Plane.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabeledEdge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LabeledEdge }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "LabeledEdge")
    public JAXBElement<LabeledEdge> createLabeledEdge(LabeledEdge value) {
        return new JAXBElement<LabeledEdge>(_LabeledEdge_QNAME, LabeledEdge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Label }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Label }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "Label")
    public JAXBElement<Label> createLabel(Label value) {
        return new JAXBElement<Label>(_Label_QNAME, Label.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabeledShape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LabeledShape }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "LabeledShape")
    public JAXBElement<LabeledShape> createLabeledShape(LabeledShape value) {
        return new JAXBElement<LabeledShape>(_LabeledShape_QNAME, LabeledShape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "from", scope = Assignment.class)
    public JAXBElement<TExpression> createAssignmentFrom(TExpression value) {
        return new JAXBElement<TExpression>(_AssignmentFrom_QNAME, TExpression.class, Assignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "to", scope = Assignment.class)
    public JAXBElement<TExpression> createAssignmentTo(TExpression value) {
        return new JAXBElement<TExpression>(_AssignmentTo_QNAME, TExpression.class, Assignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "condition", scope = ComplexBehaviorDefinition.class)
    public JAXBElement<TFormalExpression> createComplexBehaviorDefinitionCondition(TFormalExpression value) {
        return new JAXBElement<TFormalExpression>(_ComplexBehaviorDefinitionCondition_QNAME, TFormalExpression.class, ComplexBehaviorDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "event", scope = ComplexBehaviorDefinition.class)
    public JAXBElement<TImplicitThrowEvent> createComplexBehaviorDefinitionEvent(TImplicitThrowEvent value) {
        return new JAXBElement<TImplicitThrowEvent>(_Event_QNAME, TImplicitThrowEvent.class, ComplexBehaviorDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "correlationPropertyRef", scope = CorrelationKey.class)
    public JAXBElement<QName> createCorrelationKeyCorrelationPropertyRef(QName value) {
        return new JAXBElement<QName>(_CorrelationKeyCorrelationPropertyRef_QNAME, QName.class, CorrelationKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "dataPath", scope = CorrelationPropertyBinding.class)
    public JAXBElement<TFormalExpression> createCorrelationPropertyBindingDataPath(TFormalExpression value) {
        return new JAXBElement<TFormalExpression>(_CorrelationPropertyBindingDataPath_QNAME, TFormalExpression.class, CorrelationPropertyBinding.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "messagePath", scope = CorrelationPropertyRetrievalExpression.class)
    public JAXBElement<TFormalExpression> createCorrelationPropertyRetrievalExpressionMessagePath(TFormalExpression value) {
        return new JAXBElement<TFormalExpression>(_CorrelationPropertyRetrievalExpressionMessagePath_QNAME, TFormalExpression.class, CorrelationPropertyRetrievalExpression.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "sourceRef", scope = TDataAssociation.class)
    @XmlIDREF
    public JAXBElement<Object> createTDataAssociationSourceRef(Object value) {
        return new JAXBElement<Object>(_TDataAssociationSourceRef_QNAME, Object.class, TDataAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "targetRef", scope = TDataAssociation.class)
    @XmlIDREF
    public JAXBElement<Object> createTDataAssociationTargetRef(Object value) {
        return new JAXBElement<Object>(_TDataAssociationTargetRef_QNAME, Object.class, TDataAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "transformation", scope = TDataAssociation.class)
    public JAXBElement<TFormalExpression> createTDataAssociationTransformation(TFormalExpression value) {
        return new JAXBElement<TFormalExpression>(_TDataAssociationTransformation_QNAME, TFormalExpression.class, TDataAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "dataInputRefs", scope = InputSet.class)
    @XmlIDREF
    public JAXBElement<Object> createInputSetDataInputRefs(Object value) {
        return new JAXBElement<Object>(_InputSetDataInputRefs_QNAME, Object.class, InputSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "optionalInputRefs", scope = InputSet.class)
    @XmlIDREF
    public JAXBElement<Object> createInputSetOptionalInputRefs(Object value) {
        return new JAXBElement<Object>(_InputSetOptionalInputRefs_QNAME, Object.class, InputSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "whileExecutingInputRefs", scope = InputSet.class)
    @XmlIDREF
    public JAXBElement<Object> createInputSetWhileExecutingInputRefs(Object value) {
        return new JAXBElement<Object>(_InputSetWhileExecutingInputRefs_QNAME, Object.class, InputSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "outputSetRefs", scope = InputSet.class)
    @XmlIDREF
    public JAXBElement<Object> createInputSetOutputSetRefs(Object value) {
        return new JAXBElement<Object>(_InputSetOutputSetRefs_QNAME, Object.class, InputSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "dataOutputRefs", scope = OutputSet.class)
    @XmlIDREF
    public JAXBElement<Object> createOutputSetDataOutputRefs(Object value) {
        return new JAXBElement<Object>(_OutputSetDataOutputRefs_QNAME, Object.class, OutputSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "optionalOutputRefs", scope = OutputSet.class)
    @XmlIDREF
    public JAXBElement<Object> createOutputSetOptionalOutputRefs(Object value) {
        return new JAXBElement<Object>(_OutputSetOptionalOutputRefs_QNAME, Object.class, OutputSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "whileExecutingOutputRefs", scope = OutputSet.class)
    @XmlIDREF
    public JAXBElement<Object> createOutputSetWhileExecutingOutputRefs(Object value) {
        return new JAXBElement<Object>(_OutputSetWhileExecutingOutputRefs_QNAME, Object.class, OutputSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "inputSetRefs", scope = OutputSet.class)
    @XmlIDREF
    public JAXBElement<Object> createOutputSetInputSetRefs(Object value) {
        return new JAXBElement<Object>(_OutputSetInputSetRefs_QNAME, Object.class, OutputSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TBaseElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TBaseElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "partitionElement", scope = Lane.class)
    public JAXBElement<TBaseElement> createLanePartitionElement(TBaseElement value) {
        return new JAXBElement<TBaseElement>(_LanePartitionElement_QNAME, TBaseElement.class, Lane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "flowNodeRef", scope = Lane.class)
    @XmlIDREF
    public JAXBElement<Object> createLaneFlowNodeRef(Object value) {
        return new JAXBElement<Object>(_LaneFlowNodeRef_QNAME, Object.class, Lane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaneSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LaneSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "childLaneSet", scope = Lane.class)
    public JAXBElement<LaneSet> createLaneChildLaneSet(LaneSet value) {
        return new JAXBElement<LaneSet>(_LaneChildLaneSet_QNAME, LaneSet.class, Lane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "inMessageRef", scope = Operation.class)
    public JAXBElement<QName> createOperationInMessageRef(QName value) {
        return new JAXBElement<QName>(_OperationInMessageRef_QNAME, QName.class, Operation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "outMessageRef", scope = Operation.class)
    public JAXBElement<QName> createOperationOutMessageRef(QName value) {
        return new JAXBElement<QName>(_OperationOutMessageRef_QNAME, QName.class, Operation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "errorRef", scope = Operation.class)
    public JAXBElement<QName> createOperationErrorRef(QName value) {
        return new JAXBElement<QName>(_OperationErrorRef_QNAME, QName.class, Operation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "interfaceRef", scope = Participant.class)
    public JAXBElement<QName> createParticipantInterfaceRef(QName value) {
        return new JAXBElement<QName>(_ParticipantInterfaceRef_QNAME, QName.class, Participant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "endPointRef", scope = Participant.class)
    public JAXBElement<QName> createParticipantEndPointRef(QName value) {
        return new JAXBElement<QName>(_ParticipantEndPointRef_QNAME, QName.class, Participant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "innerParticipantRef", scope = ParticipantAssociation.class)
    public JAXBElement<QName> createParticipantAssociationInnerParticipantRef(QName value) {
        return new JAXBElement<QName>(_ParticipantAssociationInnerParticipantRef_QNAME, QName.class, ParticipantAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "outerParticipantRef", scope = ParticipantAssociation.class)
    public JAXBElement<QName> createParticipantAssociationOuterParticipantRef(QName value) {
        return new JAXBElement<QName>(_ParticipantAssociationOuterParticipantRef_QNAME, QName.class, ParticipantAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "source", scope = Relationship.class)
    public JAXBElement<QName> createRelationshipSource(QName value) {
        return new JAXBElement<QName>(_RelationshipSource_QNAME, QName.class, Relationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "target", scope = Relationship.class)
    public JAXBElement<QName> createRelationshipTarget(QName value) {
        return new JAXBElement<QName>(_RelationshipTarget_QNAME, QName.class, Relationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagramElement.Extension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiagramElement.Extension }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "extension", scope = DiagramElement.class)
    public JAXBElement<DiagramElement.Extension> createDiagramElementExtension(DiagramElement.Extension value) {
        return new JAXBElement<DiagramElement.Extension>(_DiagramElementExtension_QNAME, DiagramElement.Extension.class, DiagramElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/modeler/1.0", name = "executionPlatform", scope = Modeler.class)
    public JAXBElement<String> createModelerExecutionPlatform(String value) {
        return new JAXBElement<String>(_ModelerExecutionPlatform_QNAME, String.class, Modeler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/modeler/1.0", name = "executionPlatformVersion", scope = Modeler.class)
    public JAXBElement<String> createModelerExecutionPlatformVersion(String value) {
        return new JAXBElement<String>(_ModelerExecutionPlatformVersion_QNAME, String.class, Modeler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/zeebe/1.0", name = "taskDefinition", scope = Zeebe.class)
    public JAXBElement<TaskDefinition> createZeebeTaskDefinition(TaskDefinition value) {
        return new JAXBElement<TaskDefinition>(_ZeebeTaskDefinition_QNAME, TaskDefinition.class, Zeebe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/zeebe/1.0", name = "input", scope = Zeebe.class)
    public JAXBElement<String> createZeebeInput(String value) {
        return new JAXBElement<String>(_ZeebeInput_QNAME, String.class, Zeebe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/zeebe/1.0", name = "output", scope = Zeebe.class)
    public JAXBElement<String> createZeebeOutput(String value) {
        return new JAXBElement<String>(_ZeebeOutput_QNAME, String.class, Zeebe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/zeebe/1.0", name = "subscription", scope = Zeebe.class)
    public JAXBElement<Subscription> createZeebeSubscription(Subscription value) {
        return new JAXBElement<Subscription>(_ZeebeSubscription_QNAME, Subscription.class, Zeebe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalledDecision }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalledDecision }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/zeebe/1.0", name = "calledDecision", scope = Zeebe.class)
    public JAXBElement<CalledDecision> createZeebeCalledDecision(CalledDecision value) {
        return new JAXBElement<CalledDecision>(_ZeebeCalledDecision_QNAME, CalledDecision.class, Zeebe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/1.0/bpmn", name = "expression", scope = FieldType.class)
    public JAXBElement<String> createFieldTypeExpression(String value) {
        return new JAXBElement<String>(_FieldTypeExpression_QNAME, String.class, FieldType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/1.0/bpmn", name = "string", scope = FieldType.class)
    public JAXBElement<String> createFieldTypeString(String value) {
        return new JAXBElement<String>(_FieldTypeString_QNAME, String.class, FieldType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/1.0/bpmn", name = "property", scope = PropertiesType.class)
    public JAXBElement<PropertyType> createPropertiesTypeProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_PropertiesTypeProperty_QNAME, PropertyType.class, PropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FieldType }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/1.0/bpmn", name = "field", scope = TaskListenerType.class)
    public JAXBElement<FieldType> createTaskListenerTypeField(FieldType value) {
        return new JAXBElement<FieldType>(_TaskListenerTypeField_QNAME, FieldType.class, TaskListenerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FieldType }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/1.0/bpmn", name = "field", scope = ExecutionListenerType.class)
    public JAXBElement<FieldType> createExecutionListenerTypeField(FieldType value) {
        return new JAXBElement<FieldType>(_TaskListenerTypeField_QNAME, FieldType.class, ExecutionListenerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/1.0/bpmn", name = "inputParameter", scope = InputOutputType.class)
    public JAXBElement<InputParameterType> createInputOutputTypeInputParameter(InputParameterType value) {
        return new JAXBElement<InputParameterType>(_InputOutputTypeInputParameter_QNAME, InputParameterType.class, InputOutputType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputParameterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OutputParameterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://camunda.org/schema/1.0/bpmn", name = "outputParameter", scope = InputOutputType.class)
    public JAXBElement<OutputParameterType> createInputOutputTypeOutputParameter(OutputParameterType value) {
        return new JAXBElement<OutputParameterType>(_InputOutputTypeOutputParameter_QNAME, OutputParameterType.class, InputOutputType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Point }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Point }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DI", name = "waypoint", scope = Edge.class)
    public JAXBElement<Point> createEdgeWaypoint(Point value) {
        return new JAXBElement<Point>(_EdgeWaypoint_QNAME, Point.class, Edge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "categoryValueRef", scope = TFlowElement.class)
    public JAXBElement<QName> createTFlowElementCategoryValueRef(QName value) {
        return new JAXBElement<QName>(_TFlowElementCategoryValueRef_QNAME, QName.class, TFlowElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "incoming", scope = TFlowNode.class)
    public JAXBElement<QName> createTFlowNodeIncoming(QName value) {
        return new JAXBElement<QName>(_TFlowNodeIncoming_QNAME, QName.class, TFlowNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "outgoing", scope = TFlowNode.class)
    public JAXBElement<QName> createTFlowNodeOutgoing(QName value) {
        return new JAXBElement<QName>(_TFlowNodeOutgoing_QNAME, QName.class, TFlowNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "timeCycle", scope = TTimerEventDefinition.class)
    public JAXBElement<TExpression> createTTimerEventDefinitionTimeCycle(TExpression value) {
        return new JAXBElement<TExpression>(_TTimerEventDefinitionTimeCycle_QNAME, TExpression.class, TTimerEventDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "timeDuration", scope = TTimerEventDefinition.class)
    public JAXBElement<TExpression> createTTimerEventDefinitionTimeDuration(TExpression value) {
        return new JAXBElement<TExpression>(_TTimerEventDefinitionTimeDuration_QNAME, TExpression.class, TTimerEventDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "timeDate", scope = TTimerEventDefinition.class)
    public JAXBElement<TExpression> createTTimerEventDefinitionTimeDate(TExpression value) {
        return new JAXBElement<TExpression>(_TTimerEventDefinitionTimeDate_QNAME, TExpression.class, TTimerEventDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "eventDefinitionRef", scope = TThrowEvent.class)
    public JAXBElement<QName> createTThrowEventEventDefinitionRef(QName value) {
        return new JAXBElement<QName>(_TThrowEventEventDefinitionRef_QNAME, QName.class, TThrowEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "participantRef", scope = TConversationNode.class)
    public JAXBElement<QName> createTConversationNodeParticipantRef(QName value) {
        return new JAXBElement<QName>(_TConversationNodeParticipantRef_QNAME, QName.class, TConversationNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "messageFlowRef", scope = TConversationNode.class)
    public JAXBElement<QName> createTConversationNodeMessageFlowRef(QName value) {
        return new JAXBElement<QName>(_TConversationNodeMessageFlowRef_QNAME, QName.class, TConversationNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "participantRef", scope = TChoreographyActivity.class)
    public JAXBElement<QName> createTChoreographyActivityParticipantRef(QName value) {
        return new JAXBElement<QName>(_TConversationNodeParticipantRef_QNAME, QName.class, TChoreographyActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "eventDefinitionRef", scope = TCatchEvent.class)
    public JAXBElement<QName> createTCatchEventEventDefinitionRef(QName value) {
        return new JAXBElement<QName>(_TThrowEventEventDefinitionRef_QNAME, QName.class, TCatchEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "loopCondition", scope = TStandardLoopCharacteristics.class)
    public JAXBElement<TExpression> createTStandardLoopCharacteristicsLoopCondition(TExpression value) {
        return new JAXBElement<TExpression>(_TStandardLoopCharacteristicsLoopCondition_QNAME, TExpression.class, TStandardLoopCharacteristics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "conditionExpression", scope = TSequenceFlow.class)
    public JAXBElement<TExpression> createTSequenceFlowConditionExpression(TExpression value) {
        return new JAXBElement<TExpression>(_TSequenceFlowConditionExpression_QNAME, TExpression.class, TSequenceFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "supportedInterfaceRef", scope = TCallableElement.class)
    public JAXBElement<QName> createTCallableElementSupportedInterfaceRef(QName value) {
        return new JAXBElement<QName>(_TCallableElementSupportedInterfaceRef_QNAME, QName.class, TCallableElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "supports", scope = TProcess.class)
    public JAXBElement<QName> createTProcessSupports(QName value) {
        return new JAXBElement<QName>(_TProcessSupports_QNAME, QName.class, TProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "resourceRef", scope = TResourceRole.class)
    public JAXBElement<QName> createTResourceRoleResourceRef(QName value) {
        return new JAXBElement<QName>(_TResourceRoleResourceRef_QNAME, QName.class, TResourceRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "participantRef", scope = TPartnerRole.class)
    public JAXBElement<QName> createTPartnerRoleParticipantRef(QName value) {
        return new JAXBElement<QName>(_TConversationNodeParticipantRef_QNAME, QName.class, TPartnerRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "participantRef", scope = TPartnerEntity.class)
    public JAXBElement<QName> createTPartnerEntityParticipantRef(QName value) {
        return new JAXBElement<QName>(_TConversationNodeParticipantRef_QNAME, QName.class, TPartnerEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "loopCardinality", scope = TMultiInstanceLoopCharacteristics.class)
    public JAXBElement<TExpression> createTMultiInstanceLoopCharacteristicsLoopCardinality(TExpression value) {
        return new JAXBElement<TExpression>(_TMultiInstanceLoopCharacteristicsLoopCardinality_QNAME, TExpression.class, TMultiInstanceLoopCharacteristics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "loopDataInputRef", scope = TMultiInstanceLoopCharacteristics.class)
    public JAXBElement<QName> createTMultiInstanceLoopCharacteristicsLoopDataInputRef(QName value) {
        return new JAXBElement<QName>(_TMultiInstanceLoopCharacteristicsLoopDataInputRef_QNAME, QName.class, TMultiInstanceLoopCharacteristics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "loopDataOutputRef", scope = TMultiInstanceLoopCharacteristics.class)
    public JAXBElement<QName> createTMultiInstanceLoopCharacteristicsLoopDataOutputRef(QName value) {
        return new JAXBElement<QName>(_TMultiInstanceLoopCharacteristicsLoopDataOutputRef_QNAME, QName.class, TMultiInstanceLoopCharacteristics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "inputDataItem", scope = TMultiInstanceLoopCharacteristics.class)
    public JAXBElement<DataInput> createTMultiInstanceLoopCharacteristicsInputDataItem(DataInput value) {
        return new JAXBElement<DataInput>(_TMultiInstanceLoopCharacteristicsInputDataItem_QNAME, DataInput.class, TMultiInstanceLoopCharacteristics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "outputDataItem", scope = TMultiInstanceLoopCharacteristics.class)
    public JAXBElement<DataOutput> createTMultiInstanceLoopCharacteristicsOutputDataItem(DataOutput value) {
        return new JAXBElement<DataOutput>(_TMultiInstanceLoopCharacteristicsOutputDataItem_QNAME, DataOutput.class, TMultiInstanceLoopCharacteristics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "completionCondition", scope = TMultiInstanceLoopCharacteristics.class)
    public JAXBElement<TExpression> createTMultiInstanceLoopCharacteristicsCompletionCondition(TExpression value) {
        return new JAXBElement<TExpression>(_TMultiInstanceLoopCharacteristicsCompletionCondition_QNAME, TExpression.class, TMultiInstanceLoopCharacteristics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "operationRef", scope = TMessageEventDefinition.class)
    public JAXBElement<QName> createTMessageEventDefinitionOperationRef(QName value) {
        return new JAXBElement<QName>(_TMessageEventDefinitionOperationRef_QNAME, QName.class, TMessageEventDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "source", scope = TLinkEventDefinition.class)
    public JAXBElement<QName> createTLinkEventDefinitionSource(QName value) {
        return new JAXBElement<QName>(_RelationshipSource_QNAME, QName.class, TLinkEventDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "target", scope = TLinkEventDefinition.class)
    public JAXBElement<QName> createTLinkEventDefinitionTarget(QName value) {
        return new JAXBElement<QName>(_RelationshipTarget_QNAME, QName.class, TLinkEventDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "choreographyRef", scope = TCollaboration.class)
    public JAXBElement<QName> createTCollaborationChoreographyRef(QName value) {
        return new JAXBElement<QName>(_TCollaborationChoreographyRef_QNAME, QName.class, TCollaboration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "condition", scope = TConditionalEventDefinition.class)
    public JAXBElement<TExpression> createTConditionalEventDefinitionCondition(TExpression value) {
        return new JAXBElement<TExpression>(_ComplexBehaviorDefinitionCondition_QNAME, TExpression.class, TConditionalEventDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "activationCondition", scope = TComplexGateway.class)
    public JAXBElement<TExpression> createTComplexGatewayActivationCondition(TExpression value) {
        return new JAXBElement<TExpression>(_TComplexGatewayActivationCondition_QNAME, TExpression.class, TComplexGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "messageFlowRef", scope = TChoreographyTask.class)
    public JAXBElement<QName> createTChoreographyTaskMessageFlowRef(QName value) {
        return new JAXBElement<QName>(_TConversationNodeMessageFlowRef_QNAME, QName.class, TChoreographyTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", name = "completionCondition", scope = TAdHocSubProcess.class)
    public JAXBElement<TExpression> createTAdHocSubProcessCompletionCondition(TExpression value) {
        return new JAXBElement<TExpression>(_TMultiInstanceLoopCharacteristicsCompletionCondition_QNAME, TExpression.class, TAdHocSubProcess.class, value);
    }

}
