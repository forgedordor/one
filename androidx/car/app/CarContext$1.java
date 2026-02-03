package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import defpackage.clg;
import defpackage.cls;
import defpackage.lvb;
import defpackage.lvc;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ clg this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ lvc val$lifecycle;
    final /* synthetic */ cls val$listener;

    CarContext$1(clg clgVar, lvc lvcVar, Executor executor, cls clsVar) {
        this.this$0 = clgVar;
        this.val$lifecycle = lvcVar;
        this.val$executor = executor;
        this.val$listener = clsVar;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (this.val$lifecycle.a().a(lvb.c)) {
            final List listAsList = Arrays.asList(strArr);
            final List listAsList2 = Arrays.asList(strArr2);
            Executor executor = this.val$executor;
            final cls clsVar = this.val$listener;
            executor.execute(new Runnable() { // from class: cle
                @Override // java.lang.Runnable
                public final void run() {
                    cls clsVar2 = clsVar;
                    List list = listAsList;
                    List list2 = listAsList2;
                    clsVar2.a();
                }
            });
        }
    }
}
