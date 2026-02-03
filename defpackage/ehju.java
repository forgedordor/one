package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehju implements eyif {
    public static ehey a(ehfn ehfnVar, ehez ehezVar, final ehvf ehvfVar, Map map, Executor executor, final eheg ehegVar, final ehgc ehgcVar) {
        ehfnVar.getClass();
        ehezVar.getClass();
        ehvfVar.getClass();
        executor.getClass();
        ehegVar.getClass();
        return ehezVar.a(ehde.c, new fdap() { // from class: ehjo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                ehve ehveVar = ehgcVar.a(str) ? new ehve(1, 1) : new ehve(1, 2);
                Uri uriC = ehvfVar.c(ehveVar, File.separator + "phenotype" + File.separator + str);
                uriC.getClass();
                return uriC;
            }
        }, executor, map, ehjr.a, new ehjs(ehfnVar), new eooz() { // from class: ehjp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ehegVar.a((String) obj);
            }
        }, new fdae() { // from class: ehjq
            @Override // defpackage.fdae
            public final Object invoke() {
                return "";
            }
        });
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
