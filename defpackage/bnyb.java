package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnyb {
    public final bnyc a;
    public final bnyc b;
    public final bnyc c;
    public final bnyc d;
    final bnyc[] e;

    public bnyb() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bnxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar.a = "conversation_notification_settings_table.conversation_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bnxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationNotificationSettingsTable.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bnxu
        };
        bnyc bnycVar = new bnyc(dqprVarM.a());
        this.a = bnycVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "conversation_notification_settings_table.muted_until_timestamp";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bnxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationNotificationSettingsTable.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bnxw
        };
        bnyc bnycVar2 = new bnyc(dqprVarM2.a());
        this.b = bnycVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "conversation_notification_settings_table.muted_duration";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bnxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationNotificationSettingsTable.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bnxy
        };
        bnyc bnycVar3 = new bnyc(dqprVarM3.a());
        this.c = bnycVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "conversation_notification_settings_table.muted_threshold";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bnxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationNotificationSettingsTable.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bnya
        };
        bnyc bnycVar4 = new bnyc(dqprVarM4.a());
        this.d = bnycVar4;
        this.e = new bnyc[]{bnycVar, bnycVar2, bnycVar3, bnycVar4};
    }
}
