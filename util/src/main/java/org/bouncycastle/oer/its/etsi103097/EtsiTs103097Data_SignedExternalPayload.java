package org.bouncycastle.oer.its.etsi103097;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class EtsiTs103097Data_SignedExternalPayload
    extends EtsiTs103097Data
{
    public EtsiTs103097Data_SignedExternalPayload(UINT8 protocolVersion, Ieee1609Dot2Content content)
    {
        super(protocolVersion, content);
    }

    protected EtsiTs103097Data_SignedExternalPayload(ASN1Sequence src)
    {
        super(src);
    }

    public static EtsiTs103097Data_SignedExternalPayload getInstance(Object o)
    {
        if (o instanceof EtsiTs103097Data_SignedExternalPayload)
        {
            return (EtsiTs103097Data_SignedExternalPayload)o;
        }
        if (o != null)
        {
            return new EtsiTs103097Data_SignedExternalPayload(ASN1Sequence.getInstance(o));
        }
        return null;
    }
}
