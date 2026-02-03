package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffbi implements fffz {
    final /* synthetic */ ffbn a;
    private final fffg b;
    private boolean c;

    public ffbi(ffbn ffbnVar) {
        this.a = ffbnVar;
        this.b = new fffg(ffbnVar.d.a());
    }

    @Override // defpackage.fffz
    public final ffgd a() {
        return this.b;
    }

    @Override // defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        ffbn ffbnVar = this.a;
        ffbnVar.d.ac("0\r\n\r\n");
        ffbn.l(this.b);
        ffbnVar.e = 3;
    }

    @Override // defpackage.fffz, java.io.Flushable
    public final synchronized void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fffa fffaVar = this.a.d;
        ffft ffftVar = (ffft) fffaVar;
        if (ffftVar.c) {
            throw new IllegalStateException("closed");
        }
        ffftVar.b.Y(j);
        ffftVar.c();
        fffaVar.ac(VCardBuilder.VCARD_END_OF_LINE);
        fffaVar.hO(ffezVar, j);
        fffaVar.ac(VCardBuilder.VCARD_END_OF_LINE);
    }
}
