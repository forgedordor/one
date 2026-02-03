package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbhn extends dbhp {
    final /* synthetic */ ekhx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbhn(dbhq dbhqVar, ekhx ekhxVar) {
        super(dbhqVar);
        this.a = ekhxVar;
    }

    @Override // defpackage.dbho
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        Set<String> stringSet = sharedPreferences.getStringSet(this.c, this.a);
        if (stringSet != null) {
            return ekhx.o(stringSet);
        }
        return null;
    }

    @Override // defpackage.dbho
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Set<String> set = (Set) obj;
        if (set == null) {
            throw new IllegalArgumentException("null cannot be written for Set<String>");
        }
        editor.putStringSet(this.c, set);
    }
}
