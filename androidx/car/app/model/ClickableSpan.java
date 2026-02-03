package androidx.car.app.model;

import defpackage.cmb;
import defpackage.coj;
import defpackage.col;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class ClickableSpan extends CarSpan {
    private final coj mOnClickDelegate;

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }

    public static ClickableSpan create(col colVar) {
        colVar.getClass();
        return new ClickableSpan(colVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public coj getOnClickDelegate() {
        coj cojVar = this.mOnClickDelegate;
        cojVar.getClass();
        return cojVar;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan(col colVar) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(colVar);
    }
}
