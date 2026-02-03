package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eilq implements oza {
    public final /* synthetic */ eils a;
    public final /* synthetic */ String b;
    public final /* synthetic */ oza c;

    public /* synthetic */ eilq(eils eilsVar, String str, oza ozaVar) {
        this.a = eilsVar;
        this.b = str;
        this.c = ozaVar;
    }

    @Override // defpackage.oza
    public final boolean a(Preference preference, Object obj) {
        eibu eibuVar = this.a.a;
        oza ozaVar = this.c;
        eifp eifpVarA = eibuVar.a("OnPreferenceChangeListener", this.b);
        try {
            boolean zA = ozaVar.a(preference, obj);
            eifpVarA.close();
            return zA;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
