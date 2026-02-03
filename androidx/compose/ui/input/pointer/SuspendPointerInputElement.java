package androidx.compose.ui.input.pointer;

import defpackage.fdbq;
import defpackage.icr;
import defpackage.ito;
import defpackage.jdy;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends jdy<ito> {
    private final Object a;
    private final Object b;
    private final Object[] c;
    private final PointerInputEventHandler d;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        this.a = 1 == (i & 1) ? null : obj;
        this.b = (i & 2) != 0 ? null : obj2;
        this.c = (i & 4) != 0 ? null : objArr;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ito(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ito itoVar = (ito) icrVar;
        Object obj = itoVar.a;
        Object obj2 = this.a;
        boolean z = !fdbq.f(obj, obj2);
        itoVar.a = obj2;
        Object obj3 = itoVar.b;
        Object obj4 = this.b;
        boolean z2 = !fdbq.f(obj3, obj4);
        itoVar.b = obj4;
        Object[] objArr = itoVar.c;
        boolean z3 = z | z2;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z3 = true;
        }
        if (objArr == null && objArr2 != null) {
            z3 = true;
        }
        boolean z4 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z3 : true;
        PointerInputEventHandler pointerInputEventHandler = this.d;
        itoVar.c = objArr2;
        if (itoVar.d.getClass() != pointerInputEventHandler.getClass() || z4) {
            itoVar.r();
        }
        itoVar.d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!fdbq.f(this.a, suspendPointerInputElement.a) || !fdbq.f(this.b, suspendPointerInputElement.b)) {
            return false;
        }
        Object[] objArr = this.c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.c != null) {
            return false;
        }
        return this.d == suspendPointerInputElement.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = iHashCode * 31;
        Object[] objArr = this.c;
        return ((((i + iHashCode2) * 31) + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31) + this.d.hashCode();
    }
}
