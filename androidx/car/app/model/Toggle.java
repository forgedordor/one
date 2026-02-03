package androidx.car.app.model;

import defpackage.cmb;
import defpackage.coh;
import defpackage.cpq;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final coh mOnCheckedChangeDelegate;

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public coh getOnCheckedChangeDelegate() {
        coh cohVar = this.mOnCheckedChangeDelegate;
        cohVar.getClass();
        return cohVar;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public String toString() {
        return "[ isChecked: " + this.mIsChecked + ", isEnabled: " + this.mIsEnabled + "]";
    }

    Toggle(cpq cpqVar) {
        boolean z = cpqVar.b;
        this.mIsChecked = false;
        boolean z2 = cpqVar.c;
        this.mIsEnabled = false;
        coh cohVar = cpqVar.a;
        this.mOnCheckedChangeDelegate = null;
    }
}
