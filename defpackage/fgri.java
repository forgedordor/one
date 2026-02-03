package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgri extends fgsb {
    public fgri(String str) {
        super(str);
    }

    @Override // defpackage.fgsb, defpackage.fgry
    public final String a() {
        return "#cdata";
    }

    @Override // defpackage.fgsb
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final fgri c() {
        return (fgri) super.c();
    }

    @Override // defpackage.fgsb, defpackage.fgry
    public final void e(Appendable appendable, int i, fgrl fgrlVar) throws IOException {
        appendable.append("<![CDATA[").append(m());
    }

    @Override // defpackage.fgsb, defpackage.fgry
    public final void f(Appendable appendable, int i, fgrl fgrlVar) throws IOException {
        appendable.append("]]>");
    }
}
