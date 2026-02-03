package defpackage;

import com.android.vcard.VCardConstants;
import java.io.Reader;
import java.io.StreamTokenizer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cplm {
    final /* synthetic */ cplo a;

    public cplm(cplo cploVar) {
        this.a = cploVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, femm femmVar) {
        cplo.f(streamTokenizer, reader, -3);
        while (!ejuf.e(VCardConstants.PROPERTY_END, streamTokenizer.sval)) {
            if (ejuf.e(VCardConstants.PROPERTY_BEGIN, streamTokenizer.sval)) {
                this.a.c.a(streamTokenizer, reader, femmVar);
            } else {
                this.a.e.a(streamTokenizer, reader, femmVar);
            }
            cplo.c(streamTokenizer, reader);
        }
    }
}
