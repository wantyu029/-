package myorg.bouncycastle.cms;

import java.security.NoSuchAlgorithmException;

interface DigestCalculator {

   byte[] getDigest() throws NoSuchAlgorithmException;
}
