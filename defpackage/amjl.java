package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amjl implements anbf {
    private final bvcx a;
    private final ancj b;

    public amjl(final dqsn dqsnVar, anch anchVar) {
        dqsnVar.getClass();
        anchVar.getClass();
        String[] strArr = VmtTable.a;
        bvcy bvcyVar = new bvcy(VmtTable.a);
        bvcyVar.A("VoiceTranscriptionChangeObserver");
        bvcx bvcxVarB = bvcyVar.b();
        this.a = bvcxVarB;
        this.b = anchVar.a("VoiceTranscriptionChangeObserver", bvcxVarB, new anci() { // from class: amjk
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new amjy(dqsnVar, new fdap() { // from class: amjj
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        ekgbVar.getClass();
                        consumer.z(ekgbVar);
                        return fctx.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.anbf
    public final anbe a() {
        return this.b.a();
    }

    @Override // defpackage.anbf
    public final cquc b(ajmg ajmgVar) {
        return this.b.b(ajmgVar);
    }
}
