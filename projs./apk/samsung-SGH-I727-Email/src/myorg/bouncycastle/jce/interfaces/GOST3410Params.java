package myorg.bouncycastle.jce.interfaces;

import myorg.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

public interface GOST3410Params {

   String getDigestParamSetOID();

   String getEncryptionParamSetOID();

   String getPublicKeyParamSetOID();

   GOST3410PublicKeyParameterSetSpec getPublicKeyParameters();
}
