package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzk extends fcyz implements fdat {
    final /* synthetic */ dnzl a;
    final /* synthetic */ int b;
    final /* synthetic */ OutputStream c;
    final /* synthetic */ dnzg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnzk(dnzl dnzlVar, int i, OutputStream outputStream, dnzg dnzgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dnzlVar;
        this.b = i;
        this.c = outputStream;
        this.d = dnzgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnzk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dnzl dnzlVar = this.a;
        if (dnzlVar.b()) {
            throw new IllegalStateException("Cannot start again while encoding session is in progress.");
        }
        rcl rclVarA = dnzlVar.a();
        int i = this.b;
        boolean z = true;
        if (i <= 0) {
            i = 1;
        }
        rclVarA.k = i;
        rcl rclVarA2 = dnzlVar.a();
        OutputStream outputStream = this.c;
        if (outputStream != null) {
            rclVarA2.e = outputStream;
            try {
                rclVarA2.a("GIF89a");
            } catch (IOException unused) {
                z = false;
            }
            rclVarA2.d = z;
        }
        dnzl dnzlVar2 = this.a;
        dnzlVar2.d = fdod.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        dnzlVar2.c = fdil.c(dnzlVar2.b, null, new dnzj(dnzlVar2, this.d, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnzk(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
