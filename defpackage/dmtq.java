package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmtq extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dmtr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmtq(dmtr dmtrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dmtrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmtq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdap fdapVar;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.b != 0) {
                Object obj2 = this.a;
                fctl.b(obj);
                fdapVar = obj2;
            } else {
                fctl.b(obj);
                dmtr dmtrVar = this.c;
                fdap fdapVar2 = dmtrVar.z;
                dmpw dmpwVarG = dmtrVar.G();
                azg azgVar = dmtrVar.A;
                this.a = fdapVar2;
                this.b = 1;
                obj = dmpwVarG.b(azgVar, R.id.mini_camera_preview_view, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                fdapVar = fdapVar2;
            }
            fdapVar.invoke(obj);
        } catch (bbg e) {
            ((ekrd) ((ekrd) dmtr.v.i()).g(e).h("com/google/android/libraries/compose/cameragallery/ui/camera/mini/MiniCameraViewHolder$takePhoto$1", "invokeSuspend", 247, "MiniCameraViewHolder.kt")).q("Unable to capture image");
            this.c.I(R.string.mini_camera_take_photo_failed_error_message);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmtq(this.c, fcxyVar);
    }
}
