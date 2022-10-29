/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RSPDefinitions"
 * 	found in "../../../asn1/rsp.asn"
 * 	`asn1c -fwide-types -fcompound-names -fincludes-quoted -no-gen-example`
 */

#include "RemoteOpId.h"

/*
 * This type is implemented using INTEGER,
 * so here we adjust the DEF accordingly.
 */
static const ber_tlv_tag_t asn_DEF_RemoteOpId_tags_1[] = {
	(ASN_TAG_CLASS_CONTEXT | (2 << 2)),
	(ASN_TAG_CLASS_UNIVERSAL | (2 << 2))
};
asn_TYPE_descriptor_t asn_DEF_RemoteOpId = {
	"RemoteOpId",
	"RemoteOpId",
	&asn_OP_INTEGER,
	asn_DEF_RemoteOpId_tags_1,
	sizeof(asn_DEF_RemoteOpId_tags_1)
		/sizeof(asn_DEF_RemoteOpId_tags_1[0]) - 1, /* 1 */
	asn_DEF_RemoteOpId_tags_1,	/* Same as above */
	sizeof(asn_DEF_RemoteOpId_tags_1)
		/sizeof(asn_DEF_RemoteOpId_tags_1[0]), /* 2 */
	{ 0, 0, INTEGER_constraint },
	0, 0,	/* Defined elsewhere */
	0	/* No specifics */
};
