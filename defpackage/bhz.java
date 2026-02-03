package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bhz {
    public static void a(bib bibVar, bog bogVar) {
        int i = bibVar.i();
        if (i == 1) {
            return;
        }
        int i2 = i - 1;
        int i3 = i2 != 1 ? i2 != 2 ? 1 : 0 : 32;
        if ((i3 & 1) == 1) {
            bogVar.b("LightSource", "4");
        }
        bogVar.b("Flash", String.valueOf(i3));
    }
}
