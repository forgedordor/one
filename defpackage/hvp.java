package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hvp extends fcuj implements Map, hux {
    public static final hvp a = new hvp(hwg.a, 0);
    public final hwg b;
    public final int c;

    public hvp(hwg hwgVar, int i) {
        this.b = hwgVar;
        this.c = i;
    }

    @Override // defpackage.fcuj
    public final int b() {
        return this.c;
    }

    public final hvp c(Object obj, Object obj2) {
        hwf hwfVarD = this.b.d(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return hwfVarD == null ? this : new hvp(hwfVarD.a, b() + hwfVarD.b);
    }

    @Override // defpackage.fcuj, java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.hux
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public hvr a() {
        return new hvr(this);
    }

    @Override // defpackage.fcuj
    public final /* synthetic */ Collection e() {
        return new hwd(this);
    }

    @Override // defpackage.fcuj
    public final Set f() {
        return new hvz(this);
    }

    @Override // defpackage.fcuj
    public final /* synthetic */ Set g() {
        return new hwb(this);
    }

    @Override // defpackage.fcuj, java.util.Map
    public Object get(Object obj) {
        return this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
