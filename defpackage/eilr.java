package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eilr implements ozb {
    public final /* synthetic */ eils a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ozb c;

    public /* synthetic */ eilr(eils eilsVar, String str, ozb ozbVar) {
        this.a = eilsVar;
        this.b = str;
        this.c = ozbVar;
    }

    @Override // defpackage.ozb
    public final boolean a(Preference preference) {
        eibu eibuVar = this.a.a;
        ozb ozbVar = this.c;
        eifp eifpVarA = eibuVar.a("OnPreferenceClickListener", this.b);
        try {
            boolean zA = ozbVar.a(preference);
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
