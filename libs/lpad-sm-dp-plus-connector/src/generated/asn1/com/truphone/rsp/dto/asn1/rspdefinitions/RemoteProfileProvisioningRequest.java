/*
 * This class file was automatically generated by ASN1bean v1.13.0 (http://www.beanit.com)
 */

package com.truphone.rsp.dto.asn1.rspdefinitions;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.asn1bean.ber.*;
import com.beanit.asn1bean.ber.types.*;
import com.beanit.asn1bean.ber.types.string.*;

import com.truphone.rsp.dto.asn1.pkix1explicit88.Certificate;
import com.truphone.rsp.dto.asn1.pkix1explicit88.CertificateList;
import com.truphone.rsp.dto.asn1.pkix1explicit88.Time;
import com.truphone.rsp.dto.asn1.pkix1implicit88.SubjectKeyIdentifier;

public class RemoteProfileProvisioningRequest implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	private byte[] code = null;
	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2);

	private InitiateAuthenticationRequest initiateAuthenticationRequest = null;
	private AuthenticateClientRequest authenticateClientRequest = null;
	private GetBoundProfilePackageRequest getBoundProfilePackageRequest = null;
	private CancelSessionRequestEs9 cancelSessionRequestEs9 = null;
	private HandleNotification handleNotification = null;
	
	public RemoteProfileProvisioningRequest() {
	}

	public RemoteProfileProvisioningRequest(byte[] code) {
		this.code = code;
	}

	public void setInitiateAuthenticationRequest(InitiateAuthenticationRequest initiateAuthenticationRequest) {
		this.initiateAuthenticationRequest = initiateAuthenticationRequest;
	}

	public InitiateAuthenticationRequest getInitiateAuthenticationRequest() {
		return initiateAuthenticationRequest;
	}

	public void setAuthenticateClientRequest(AuthenticateClientRequest authenticateClientRequest) {
		this.authenticateClientRequest = authenticateClientRequest;
	}

	public AuthenticateClientRequest getAuthenticateClientRequest() {
		return authenticateClientRequest;
	}

	public void setGetBoundProfilePackageRequest(GetBoundProfilePackageRequest getBoundProfilePackageRequest) {
		this.getBoundProfilePackageRequest = getBoundProfilePackageRequest;
	}

	public GetBoundProfilePackageRequest getGetBoundProfilePackageRequest() {
		return getBoundProfilePackageRequest;
	}

	public void setCancelSessionRequestEs9(CancelSessionRequestEs9 cancelSessionRequestEs9) {
		this.cancelSessionRequestEs9 = cancelSessionRequestEs9;
	}

	public CancelSessionRequestEs9 getCancelSessionRequestEs9() {
		return cancelSessionRequestEs9;
	}

	public void setHandleNotification(HandleNotification handleNotification) {
		this.handleNotification = handleNotification;
	}

	public HandleNotification getHandleNotification() {
		return handleNotification;
	}

	@Override public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			reverseOS.write(code);
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		if (handleNotification != null) {
			codeLength += handleNotification.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 61
			reverseOS.write(0x3D);
			reverseOS.write(0xBF);
			codeLength += 2;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		if (cancelSessionRequestEs9 != null) {
			codeLength += cancelSessionRequestEs9.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 65
			reverseOS.write(0x41);
			reverseOS.write(0xBF);
			codeLength += 2;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		if (getBoundProfilePackageRequest != null) {
			codeLength += getBoundProfilePackageRequest.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 58
			reverseOS.write(0x3A);
			reverseOS.write(0xBF);
			codeLength += 2;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		if (authenticateClientRequest != null) {
			codeLength += authenticateClientRequest.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 59
			reverseOS.write(0x3B);
			reverseOS.write(0xBF);
			codeLength += 2;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		if (initiateAuthenticationRequest != null) {
			codeLength += initiateAuthenticationRequest.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 57
			reverseOS.write(0x39);
			reverseOS.write(0xBF);
			codeLength += 2;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	@Override public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int tlvByteCount = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			tlvByteCount += tag.decodeAndCheck(is);
		}

		BerLength explicitTagLength = new BerLength();
		tlvByteCount += explicitTagLength.decode(is);
		tlvByteCount += berTag.decode(is);

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 57)) {
			initiateAuthenticationRequest = new InitiateAuthenticationRequest();
			tlvByteCount += initiateAuthenticationRequest.decode(is, false);
			tlvByteCount += explicitTagLength.readEocIfIndefinite(is);
			return tlvByteCount;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 59)) {
			authenticateClientRequest = new AuthenticateClientRequest();
			tlvByteCount += authenticateClientRequest.decode(is, false);
			tlvByteCount += explicitTagLength.readEocIfIndefinite(is);
			return tlvByteCount;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 58)) {
			getBoundProfilePackageRequest = new GetBoundProfilePackageRequest();
			tlvByteCount += getBoundProfilePackageRequest.decode(is, false);
			tlvByteCount += explicitTagLength.readEocIfIndefinite(is);
			return tlvByteCount;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 65)) {
			cancelSessionRequestEs9 = new CancelSessionRequestEs9();
			tlvByteCount += cancelSessionRequestEs9.decode(is, false);
			tlvByteCount += explicitTagLength.readEocIfIndefinite(is);
			return tlvByteCount;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 61)) {
			handleNotification = new HandleNotification();
			tlvByteCount += handleNotification.decode(is, false);
			tlvByteCount += explicitTagLength.readEocIfIndefinite(is);
			return tlvByteCount;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS, false);
		code = reverseOS.getArray();
	}

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (initiateAuthenticationRequest != null) {
			sb.append("initiateAuthenticationRequest: ");
			initiateAuthenticationRequest.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (authenticateClientRequest != null) {
			sb.append("authenticateClientRequest: ");
			authenticateClientRequest.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (getBoundProfilePackageRequest != null) {
			sb.append("getBoundProfilePackageRequest: ");
			getBoundProfilePackageRequest.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (cancelSessionRequestEs9 != null) {
			sb.append("cancelSessionRequestEs9: ");
			cancelSessionRequestEs9.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (handleNotification != null) {
			sb.append("handleNotification: ");
			handleNotification.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}

