package defpackage;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.QuotedPrintableCodec;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewx extends fewy {
    @Override // defpackage.fewy
    public final BinaryEncoder a(feti fetiVar) throws UnsupportedEncodingException {
        if (feti.c.equals(fetiVar)) {
            return new QuotedPrintableCodec();
        }
        if (feti.d.equals(fetiVar)) {
            return new Base64();
        }
        throw new UnsupportedEncodingException(MessageFormat.format("Encoder not available for encoding [{0}]", fetiVar));
    }
}
