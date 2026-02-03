package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achq extends acht {
    public final ekgb a;
    public final acjc b;
    public final Bitmap c;
    public final ekgp d;
    public final Optional e;
    private final ekgb f;

    public achq(ekgb ekgbVar, ekgb ekgbVar2, acjc acjcVar, Bitmap bitmap, ekgp ekgpVar, Optional optional) {
        this.a = ekgbVar;
        this.f = ekgbVar2;
        this.b = acjcVar;
        this.c = bitmap;
        this.d = ekgpVar;
        this.e = optional;
    }

    @Override // defpackage.acht
    public final Bitmap a() {
        return this.c;
    }

    @Override // defpackage.acht
    public final acjc b() {
        return this.b;
    }

    @Override // defpackage.acht
    public final ekgb c() {
        return this.a;
    }

    @Override // defpackage.acht
    public final ekgb d() {
        return this.f;
    }

    @Override // defpackage.acht
    public final ekgp e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof acht) {
            acht achtVar = (acht) obj;
            if (ekjz.h(this.a, achtVar.c()) && ekjz.h(this.f, achtVar.d()) && this.b.equals(achtVar.b()) && ((bitmap = this.c) != null ? bitmap.equals(achtVar.a()) : achtVar.a() == null) && ekmi.m(this.d, achtVar.e()) && this.e.equals(achtVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.acht
    public final Optional f() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode();
        Bitmap bitmap = this.c;
        return (((((iHashCode * 1000003) ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        ekgp ekgpVar = this.d;
        Bitmap bitmap = this.c;
        acjc acjcVar = this.b;
        ekgb ekgbVar = this.f;
        return "FeedbackActivityLaunchData{feedbackDataList=" + String.valueOf(this.a) + ", unselectedFeedbackDataList=" + String.valueOf(ekgbVar) + ", consentData=" + acjcVar.toString() + ", screenshot=" + String.valueOf(bitmap) + ", extraPsd=" + String.valueOf(ekgpVar) + ", throwable=" + String.valueOf(optional) + "}";
    }
}
