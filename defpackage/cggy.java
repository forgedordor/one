package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cggy extends cgkt {
    private final cgks a;
    private final CharSequence b;
    private final int c;
    private final IconCompat d;
    private final Optional e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private final Optional k;
    private final Optional l;
    private final Optional m;
    private final Optional n;
    private final Optional o;
    private final Optional p;
    private final Optional q;
    private final Optional r;
    private final Optional s;

    public cggy(cgks cgksVar, CharSequence charSequence, int i, IconCompat iconCompat, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, Optional optional14, Optional optional15) {
        this.a = cgksVar;
        this.b = charSequence;
        this.c = i;
        this.d = iconCompat;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.i = optional5;
        this.j = optional6;
        this.k = optional7;
        this.l = optional8;
        this.m = optional9;
        this.n = optional10;
        this.o = optional11;
        this.p = optional12;
        this.q = optional13;
        this.r = optional14;
        this.s = optional15;
    }

    @Override // defpackage.cgkt
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cgkt
    public final IconCompat b() {
        return this.d;
    }

    @Override // defpackage.cgkt
    public final cgks c() {
        return this.a;
    }

    @Override // defpackage.cgkt
    public final Optional d() {
        return this.q;
    }

    @Override // defpackage.cgkt
    public final Optional e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgkt) {
            cgkt cgktVar = (cgkt) obj;
            if (this.a.equals(cgktVar.c()) && this.b.equals(cgktVar.s()) && this.c == cgktVar.a() && this.d.equals(cgktVar.b()) && this.e.equals(cgktVar.f()) && this.f.equals(cgktVar.m()) && this.g.equals(cgktVar.q()) && this.h.equals(cgktVar.p()) && this.i.equals(cgktVar.i()) && this.j.equals(cgktVar.o()) && this.k.equals(cgktVar.g()) && this.l.equals(cgktVar.r()) && this.m.equals(cgktVar.h()) && this.n.equals(cgktVar.l()) && this.o.equals(cgktVar.n()) && this.p.equals(cgktVar.e()) && this.q.equals(cgktVar.d()) && this.r.equals(cgktVar.j()) && this.s.equals(cgktVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cgkt
    public final Optional f() {
        return this.e;
    }

    @Override // defpackage.cgkt
    public final Optional g() {
        return this.k;
    }

    @Override // defpackage.cgkt
    public final Optional h() {
        return this.m;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    @Override // defpackage.cgkt
    public final Optional i() {
        return this.i;
    }

    @Override // defpackage.cgkt
    public final Optional j() {
        return this.r;
    }

    @Override // defpackage.cgkt
    public final Optional k() {
        return this.s;
    }

    @Override // defpackage.cgkt
    public final Optional l() {
        return this.n;
    }

    @Override // defpackage.cgkt
    public final Optional m() {
        return this.f;
    }

    @Override // defpackage.cgkt
    public final Optional n() {
        return this.o;
    }

    @Override // defpackage.cgkt
    public final Optional o() {
        return this.j;
    }

    @Override // defpackage.cgkt
    public final Optional p() {
        return this.h;
    }

    @Override // defpackage.cgkt
    public final Optional q() {
        return this.g;
    }

    @Override // defpackage.cgkt
    public final Optional r() {
        return this.l;
    }

    @Override // defpackage.cgkt
    public final CharSequence s() {
        return this.b;
    }

    public final String toString() {
        Optional optional = this.s;
        Optional optional2 = this.r;
        Optional optional3 = this.q;
        Optional optional4 = this.p;
        Optional optional5 = this.o;
        Optional optional6 = this.n;
        Optional optional7 = this.m;
        Optional optional8 = this.l;
        Optional optional9 = this.k;
        Optional optional10 = this.j;
        Optional optional11 = this.i;
        Optional optional12 = this.h;
        Optional optional13 = this.g;
        Optional optional14 = this.f;
        Optional optional15 = this.e;
        IconCompat iconCompat = this.d;
        return "NotificationStyleInfo{notificationStyle=" + this.a.toString() + ", titleText=" + ((String) this.b) + ", smallIconColor=" + this.c + ", smallIcon=" + iconCompat.toString() + ", contentTextV2=" + String.valueOf(optional15) + ", largeIconUri=" + String.valueOf(optional14) + ", ticker=" + String.valueOf(optional13) + ", subText=" + String.valueOf(optional12) + ", expandedContentText=" + String.valueOf(optional11) + ", messages=" + String.valueOf(optional10) + ", conversationInfo=" + String.valueOf(optional9) + ", userInfo=" + String.valueOf(optional8) + ", conversationTitle=" + String.valueOf(optional7) + ", isGroupConversation=" + String.valueOf(optional6) + ", lines=" + String.valueOf(optional5) + ", bigPictureUri=" + String.valueOf(optional4) + ", bigPictureAttachmentType=" + String.valueOf(optional3) + ", expandedLargeIconUri=" + String.valueOf(optional2) + ", expandedTitleText=" + String.valueOf(optional) + "}";
    }
}
