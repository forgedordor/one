package defpackage;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbh extends etbj {
    final /* synthetic */ boolean a;
    final /* synthetic */ Method b;
    final /* synthetic */ esyv c;
    final /* synthetic */ esyv d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etbh(String str, Field field, boolean z, Method method, esyv esyvVar, esyv esyvVar2, boolean z2, boolean z3) {
        super(str, field);
        this.a = z;
        this.b = method;
        this.c = esyvVar;
        this.d = esyvVar2;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.etbj
    public final void a(etdb etdbVar, int i, Object[] objArr) {
        Object objA = this.d.a(etdbVar);
        if (objA != null || !this.e) {
            objArr[i] = objA;
            return;
        }
        throw new esyn("null is not allowed as value for record component '" + this.i + "' of primitive type; at path " + etdbVar.e());
    }

    @Override // defpackage.etbj
    public final void b(etdb etdbVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
        Object objA = this.d.a(etdbVar);
        if (objA == null && this.e) {
            return;
        }
        if (this.a) {
            ReflectiveTypeAdapterFactory.b(obj, this.h);
        } else if (this.f) {
            throw new esyk("Cannot set value of 'static final' ".concat(etcv.e(this.h, false)));
        }
        this.h.set(obj, objA);
    }

    @Override // defpackage.etbj
    public final void c(etdd etddVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (this.a) {
            Method method = this.b;
            if (method == null) {
                ReflectiveTypeAdapterFactory.b(obj, this.h);
            } else {
                ReflectiveTypeAdapterFactory.b(obj, method);
            }
        }
        Method method2 = this.b;
        if (method2 != null) {
            try {
                objInvoke = method2.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new esyk(a.a(etcv.e(this.b, false), "Accessor ", " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.h.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        etddVar.i(this.g);
        this.c.b(etddVar, objInvoke);
    }
}
