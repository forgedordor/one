package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbhl extends dbho {
    final /* synthetic */ Boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbhl(dbhq dbhqVar, String str, Boolean bool) {
        super(dbhqVar, str);
        this.a = bool;
    }

    @Override // defpackage.dbho
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        String str = this.c;
        return sharedPreferences.contains(str) ? Boolean.valueOf(sharedPreferences.getBoolean(str, false)) : this.a;
    }

    @Override // defpackage.dbho
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            throw new IllegalArgumentException("null cannot be written for Boolean");
        }
        editor.putBoolean(this.c, bool.booleanValue());
    }
}
