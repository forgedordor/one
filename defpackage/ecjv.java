package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecjv implements ecjb {
    public final Context a;
    public final String b;
    public final Set c;
    public SharedPreferences d;
    private final Executor e;
    private final ejxr f;
    private final ecjr g;

    public ecjv(ecjs ecjsVar) {
        this.a = ecjsVar.a;
        this.e = ecjsVar.b;
        this.b = ecjsVar.c;
        this.c = ecjsVar.d;
        this.g = ecjsVar.f;
        this.f = ecjsVar.e;
    }

    public static ecjs d(Context context, Executor executor) {
        return new ecjs(context.getApplicationContext(), executor);
    }

    @Override // defpackage.ecjb
    public final ListenableFuture a() {
        return ((Boolean) this.f.get()).booleanValue() ? eorv.a : eork.m(new Callable() { // from class: ecjo
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                ecjv ecjvVar = this.a;
                Set<String> setKeySet = ecjvVar.c;
                if (setKeySet == null) {
                    setKeySet = ecjvVar.d.getAll().keySet();
                }
                SharedPreferences.Editor editorEdit = ecjvVar.d.edit();
                Iterator<String> it = setKeySet.iterator();
                while (it.hasNext()) {
                    editorEdit.remove(it.next());
                }
                if (editorEdit.commit()) {
                    return null;
                }
                throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(ecjvVar.b)));
            }
        }, this.e);
    }

    @Override // defpackage.ecjb
    public final ListenableFuture b(evuh evuhVar) {
        return eork.i(this.g.a.a(new ecju(this.d, this.c), evuhVar));
    }

    @Override // defpackage.ecjb
    public final ListenableFuture c() {
        return eork.m(new Callable() { // from class: ecjp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ecjv ecjvVar = this.a;
                ecjvVar.d = ecjvVar.a.getSharedPreferences(ecjvVar.b, 0);
                Set set = ecjvVar.c;
                if (set == null) {
                    return Boolean.valueOf(!ecjvVar.d.getAll().isEmpty());
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (ecjvVar.d.contains((String) it.next())) {
                        return true;
                    }
                }
                return false;
            }
        }, this.e);
    }
}
