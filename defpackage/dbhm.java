package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbhm extends dbho {
    final /* synthetic */ Integer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbhm(dbhq dbhqVar, String str, Integer num) {
        super(dbhqVar, str);
        this.a = num;
    }

    @Override // defpackage.dbho
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        String str = this.c;
        return sharedPreferences.contains(str) ? Integer.valueOf(sharedPreferences.getInt(str, 0)) : this.a;
    }

    @Override // defpackage.dbho
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            throw new IllegalArgumentException("null cannot be written for Integer");
        }
        editor.putInt(this.c, num.intValue());
    }
}
