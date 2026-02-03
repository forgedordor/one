package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crss {
    public static final cqce a = cqce.g("Bugle", "BugleExternalProcessUidVerifier");
    private static final ekgb e;
    private static final ekgp f;
    public boolean c;
    private final Context g;
    public final Object b = new Object();
    public final Set d = new HashSet();

    static {
        ekgb ekgbVarS = ekgb.s("AE41481F52E0F58DF2806D5A38EB3DBCA5AE02B0", "6DDB6673E07F05A1BECE93343651AD167FADDC10");
        e = ekgbVarS;
        f = ekgp.l("com.google.android.ims", ekgbVarS);
    }

    public crss(Context context) {
        this.g = context;
    }

    public final void a() {
        synchronized (this.b) {
            Set set = this.d;
            set.clear();
            ekqg ekqgVarListIterator = f.entrySet().listIterator();
            while (ekqgVarListIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                int iA = dhff.a(this.g, (String) entry.getKey(), (List) entry.getValue());
                if (iA != -1) {
                    set.add(Integer.valueOf(iA));
                }
            }
            this.c = true;
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Finished update for verified Bugle uids");
            cqbdVarA.A("verified uids", set);
            cqbdVarA.r();
        }
    }
}
