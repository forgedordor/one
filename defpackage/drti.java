package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drti extends qya {
    public static final drti a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final ekgb f;
    public final boolean g;
    public final boolean h;
    public final boolean i = false;

    static {
        drth drthVarA = a();
        drthVarA.d("");
        a = drthVarA.a();
    }

    public drti(String str, int i, int i2, int i3, ekgb ekgbVar, boolean z, boolean z2) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = ekgbVar;
        this.g = z;
        this.h = z2;
    }

    public static drth a() {
        drst drstVar = new drst();
        drstVar.g(-1);
        drstVar.b(-1);
        drstVar.c(-1);
        drstVar.e(false);
        int i = ekgb.d;
        drstVar.h(ekoe.a);
        drstVar.a = (byte) (drstVar.a | 32);
        drstVar.f(false);
        return drstVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drti)) {
            return false;
        }
        drti drtiVar = (drti) obj;
        if (this.g != drtiVar.g || this.h != drtiVar.h) {
            return false;
        }
        boolean z = drtiVar.i;
        return this.c == drtiVar.c && this.d == drtiVar.d && this.e == drtiVar.e && Objects.equals(this.b, drtiVar.b) && Objects.equals(this.f, drtiVar.f);
    }

    public final int hashCode() {
        return (((((((((((((drtg.a(this.g) * 31) + drtg.a(this.h)) * 31) + drtg.a(false)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.f);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), false};
        String[] strArrSplit = "emoji;positionInCategory;categoryIndex;categorySize;variants;inVariantsPopup;isSelected;isActivated".split(";");
        StringBuilder sb = new StringBuilder("drti[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
