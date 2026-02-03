package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbho implements dbhs {
    final dbhq b;
    final String c;

    protected dbho(dbhq dbhqVar, String str) {
        this.b = dbhqVar;
        this.c = str;
    }

    @Override // defpackage.dbhs
    public final String a() {
        return this.c;
    }

    protected abstract Object b(SharedPreferences sharedPreferences);

    protected abstract void c(SharedPreferences.Editor editor, Object obj);

    public Object d() {
        return b(this.b.a());
    }

    public final void e(Object obj) {
        SharedPreferences.Editor editorEdit = this.b.a().edit();
        c(editorEdit, obj);
        dbhq.b(editorEdit);
    }
}
