package defpackage;

import com.android.vcard.VCardConstants;
import java.io.Reader;
import java.io.StreamTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class femj {
    final /* synthetic */ feml a;

    public femj(feml femlVar) {
        this.a = femlVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, femm femmVar) {
        feml femlVar = this.a;
        femlVar.b(streamTokenizer, reader, -3);
        while (!VCardConstants.PROPERTY_END.equalsIgnoreCase(streamTokenizer.sval)) {
            if (VCardConstants.PROPERTY_BEGIN.equalsIgnoreCase(streamTokenizer.sval)) {
                femlVar.c.a(streamTokenizer, reader, femmVar);
            } else {
                femlVar.e.a(streamTokenizer, reader, femmVar);
            }
            femlVar.a(streamTokenizer, reader);
        }
    }
}
