package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anjn implements ajmb {
    final /* synthetic */ bpvd a;
    final /* synthetic */ anjp b;

    public anjn(bpvd bpvdVar, anjp anjpVar) {
        this.a = bpvdVar;
        this.b = anjpVar;
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
    public final /* bridge */ /* synthetic */ String c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ajmb
    public final /* bridge */ /* synthetic */ String d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ajmb
    public final /* bridge */ /* synthetic */ String e() {
        throw new UnsupportedOperationException();
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
    public final /* bridge */ /* synthetic */ boolean j() {
        throw new UnsupportedOperationException();
    }
}
