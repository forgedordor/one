package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbhq implements bbhl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/database/create/shortcuts/ClearShortcutsOnDatabaseCreatedListener");
    public final Context b;
    public final fcsu c;
    private final fcsu d;
    private final eosc e;
    private final eosc f;

    public bbhq(Context context, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar2) {
        this.b = context;
        this.d = fcsuVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.c = fcsuVar2;
    }

    @Override // defpackage.bbhl
    public final void a(dqsy dqsyVar) {
        if (((dqom) ((bwzy) dqsyVar).e).b.equals("$primary")) {
            auvh.e(eijx.f(new Runnable() { // from class: bbhm
                /* JADX WARN: Removed duplicated region for block: B:29:0x013f  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 628
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bbhm.run():void");
                }
            }, this.f).e(Exception.class, new ejvr() { // from class: bbhn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekrw ekrwVarJ = bbhq.a.j();
                    ekrwVarJ.X(eksq.a, "BugleShortcuts");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((Exception) obj)).h("com/google/android/apps/messaging/shared/datamodel/database/create/shortcuts/ClearShortcutsOnDatabaseCreatedListener", "onDatabaseCreated", 89, "ClearShortcutsOnDatabaseCreatedListener.java")).q("Error clearing shortcuts and notification channels on DB recreation");
                    return null;
                }
            }, this.e));
            ((ains) this.d.b()).c("Bugle.Shortcuts.ShortcutsCleared.Count");
        }
    }
}
