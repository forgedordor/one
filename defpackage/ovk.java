package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovk implements fdpm {
    final /* synthetic */ ovn a;
    final /* synthetic */ oux b;

    public ovk(ovn ovnVar, oux ouxVar) {
        this.a = ovnVar;
        this.b = ouxVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        osg osgVar = (osg) obj;
        if (ovs.a(2)) {
            Objects.toString(osgVar);
            ovs.b(2, "Collected ".concat(String.valueOf(osgVar)));
        }
        ovn ovnVar = this.a;
        Object objA = fdin.a(ovnVar.b, new ovj(osgVar, ovnVar, this.b, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
