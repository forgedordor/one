package defpackage;

import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxgs extends AsyncTask {
    private final ejxr a;
    private final ejvr b;

    public bxgs(ejxr ejxrVar, ejvr ejvrVar) {
        this.a = eiid.b(ejxrVar);
        this.b = eiid.a(ejvrVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return (bxgo) this.a.get();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
    }
}
