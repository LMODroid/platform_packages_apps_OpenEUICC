/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RSPDefinitions"
 * 	found in "../../../asn1/rsp.asn"
 * 	`asn1c -fwide-types -fcompound-names -fincludes-quoted -no-gen-example`
 */

#ifndef	_TransactionId_H_
#define	_TransactionId_H_


#include "asn_application.h"

/* Including external dependencies */
#include "OCTET_STRING.h"

#ifdef __cplusplus
extern "C" {
#endif

/* TransactionId */
typedef OCTET_STRING_t	 TransactionId_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_TransactionId_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_TransactionId;
asn_struct_free_f TransactionId_free;
asn_struct_print_f TransactionId_print;
asn_constr_check_f TransactionId_constraint;
ber_type_decoder_f TransactionId_decode_ber;
der_type_encoder_f TransactionId_encode_der;
xer_type_decoder_f TransactionId_decode_xer;
xer_type_encoder_f TransactionId_encode_xer;
oer_type_decoder_f TransactionId_decode_oer;
oer_type_encoder_f TransactionId_encode_oer;
per_type_decoder_f TransactionId_decode_uper;
per_type_encoder_f TransactionId_encode_uper;

#ifdef __cplusplus
}
#endif

#endif	/* _TransactionId_H_ */
#include "asn_internal.h"