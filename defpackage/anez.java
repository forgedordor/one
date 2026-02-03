package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anez implements ajmb {
    final /* synthetic */ bpvd a;
    final /* synthetic */ anfa b;

    public anez(bpvd bpvdVar, anfa anfaVar) {
        this.a = bpvdVar;
        this.b = anfaVar;
    }

    @Override // defpackage.ajmb
    public final Uri a() {
        String strQ = this.a.q();
        if (strQ != null) {
            return Uri.parse(strQ);
        }
        return null;
    }

    @Override // defpackage.ajmb
    public final Uri b() {
        return Uri.parse(this.a.s());
    }

    @Override // defpackage.ajmb
    public final String c() {
        return this.a.n();
    }

    @Override // defpackage.ajmb
    public final String d() {
        String strO = this.a.o();
        return strO == null ? "" : strO;
    }

    @Override // defpackage.ajmb
    public final String e() {
        String strP = this.a.p();
        return strP == null ? "" : strP;
    }

    @Override // defpackage.ajmb
    public final String f() {
        String strR = this.a.r();
        return strR == null ? "" : strR;
    }

    @Override // defpackage.ajmb
    public final boolean g() {
        return this.a.w();
    }

    @Override // defpackage.ajmb
    public final boolean h() {
        return this.b.a.f().toEpochMilli() > this.a.k();
    }

    @Override // defpackage.ajmb
    public final boolean i() {
        return this.a.x();
    }

    @Override // defpackage.ajmb
    public final boolean j() {
        return this.a.y();
    }
}
