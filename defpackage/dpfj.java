package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfj extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfj(Object obj, dpfq dpfqVar) {
        super(obj);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        fae faeVar = (fae) obj2;
        faeVar.getClass();
        int i = faeVar.b;
        Integer num = null;
        Integer num2 = kec.b(i, 1) ? 4096 : kec.b(i, 2) ? 8192 : kec.b(i, 3) ? 16384 : null;
        dpfq dpfqVar = this.a;
        dpeo.b(dpfqVar, num2);
        int i2 = faeVar.c;
        dpeo.b(dpfqVar, ked.b(i2, 1) ? 1 : ked.b(i2, 3) ? 2 : ked.b(i2, 4) ? 3 : ked.b(i2, 5) ? 16 : ked.b(i2, 6) ? 32 : ked.b(i2, 7) ? 128 : ked.b(i2, 8) ? 16 : ked.b(i2, 9) ? 8194 : null);
        int i3 = faeVar.d;
        if (kdw.b(i3, 2)) {
            num = 2;
        } else if (kdw.b(i3, 3)) {
            num = 3;
        } else if (kdw.b(i3, 4)) {
            num = 4;
        } else if (kdw.b(i3, 5)) {
            num = 7;
        } else if (kdw.b(i3, 6)) {
            num = 5;
        } else if (kdw.b(i3, 7)) {
            num = 6;
        }
        if (num != null) {
            dpfqVar.setImeOptions((dpfqVar.getImeOptions() & (-256)) | num.intValue());
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
