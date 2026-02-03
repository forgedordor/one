package defpackage;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.QuotedPrintableCodec;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feww extends fewv {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.fewv
    public final BinaryDecoder a(feti fetiVar) throws UnsupportedEncodingException {
        if (feti.c.equals(fetiVar)) {
            return new QuotedPrintableCodec();
        }
        if (feti.d.equals(fetiVar)) {
            return new Base64();
        }
        throw new UnsupportedEncodingException(MessageFormat.format("Decoder not available for encoding [{0}]", fetiVar));
    }

    @Override // defpackage.fewv
    public final StringDecoder b(feti fetiVar) throws UnsupportedEncodingException {
        if (feti.c.equals(fetiVar)) {
            return new QuotedPrintableCodec();
        }
        throw new UnsupportedEncodingException(MessageFormat.format("Decoder not available for encoding [{0}]", fetiVar));
    }
}
