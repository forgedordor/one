package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrn extends fgrw {
    public fgrn(String str, String str2, String str3) {
        fgqz.g(str);
        super.o("name", str);
        super.o("publicId", str2);
        super.o("systemId", str3);
        if (p("publicId")) {
            super.o("pubSysKey", "PUBLIC");
        } else if (p("systemId")) {
            super.o("pubSysKey", "SYSTEM");
        }
    }

    private final boolean p(String str) {
        return !fgre.h(hS(str));
    }

    @Override // defpackage.fgry
    public final String a() {
        return "#doctype";
    }

    @Override // defpackage.fgry
    public final void e(Appendable appendable, int i, fgrl fgrlVar) throws IOException {
        if (this.l > 0) {
            boolean z = fgrlVar.c;
            appendable.append('\n');
        }
        int i2 = fgrlVar.g;
        if (p("publicId") || p("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (p("name")) {
            appendable.append(" ").append(hS("name"));
        }
        if (p("pubSysKey")) {
            appendable.append(" ").append(hS("pubSysKey"));
        }
        if (p("publicId")) {
            appendable.append(" \"").append(hS("publicId")).append('\"');
        }
        if (p("systemId")) {
            appendable.append(" \"").append(hS("systemId")).append('\"');
        }
        appendable.append('>');
    }

    public final void h(String str) {
        if (str != null) {
            super.o("pubSysKey", str);
        }
    }

    @Override // defpackage.fgrw, defpackage.fgry
    public final /* bridge */ /* synthetic */ int hP() {
        return 0;
    }

    @Override // defpackage.fgrw, defpackage.fgry
    public final /* bridge */ /* synthetic */ void g() {
    }

    @Override // defpackage.fgry
    public final void f(Appendable appendable, int i, fgrl fgrlVar) {
    }
}
