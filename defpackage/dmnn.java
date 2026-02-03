package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dmnn implements fdpm, fdbl {
    final /* synthetic */ dmoo a;

    public dmnn(dmoo dmooVar) {
        this.a = dmooVar;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbb(2, this.a, dmoo.class, "onCaptureEvent", "onCaptureEvent(Lcom/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManager$CaptureEvent;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fdpm) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        Object objC;
        Object objC2;
        Object objC3;
        dmlx dmlxVar = (dmlx) obj;
        boolean z = dmlxVar instanceof dmlu;
        dmoo dmooVar = this.a;
        if (z) {
            dmooVar.b.b();
            fduf fdufVar = dmooVar.h;
            do {
                objC3 = fdufVar.c();
            } while (!fdufVar.g(objC3, dmoz.a((dmoz) objC3, 0, null, 0, null, true, null, null, null, 2097119)));
        } else if (dmlxVar instanceof dmlv) {
            dmooVar.b.c();
            fduf fdufVar2 = dmooVar.h;
            do {
                objC2 = fdufVar2.c();
            } while (!fdufVar2.g(objC2, dmoz.a((dmoz) objC2, 0, null, 0, null, false, null, null, null, 2097119)));
        } else if (!(dmlxVar instanceof dmls)) {
            if (dmlxVar instanceof dmlw) {
                dmooVar.e.invoke(((dmlw) dmlxVar).a);
            } else {
                if (!(dmlxVar instanceof dmlt)) {
                    throw new fctg();
                }
                ((ekrd) ((ekrd) dmoo.a.j()).g(((dmlt) dmlxVar).a).h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraUiAdapter", "onCaptureEvent", 300, "CameraUiAdapter.kt")).q("Camera capture failed.");
                dmooVar.b.c();
                fduf fdufVar3 = dmooVar.h;
                do {
                    objC = fdufVar3.c();
                } while (!fdufVar3.g(objC, dmoz.a((dmoz) objC, 0, null, 0, null, false, null, null, null, 2097119)));
            }
        }
        return fctx.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
