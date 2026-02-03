package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azvt {
    public static final azwc a;
    public static final azwc b;
    public static final azwc c;
    public static final azwc d;
    public static final azwc e;
    public static final azwc f;
    public static final azwc g;
    public static final azwc h;
    public static final azwc i;
    public static final azwc j;
    public static final azwc k;
    public static final azwc l;
    public static final azwc m;

    static {
        String[] strArr = botm.a;
        a = new azwc("conversations", 4);
        String[] strArr2 = MessagesTable.a;
        b = new azwc("messages", 8);
        String[] strArr3 = ParticipantsTable.a;
        c = new azwc("participants", 3);
        String[] strArr4 = awxh.a;
        new azwc("my_identities", 2);
        String[] strArr5 = PartsTable.a;
        d = new azwc("parts", 9);
        String[] strArr6 = bocg.a;
        e = new azwc("conversation_participants", 5);
        String[] strArr7 = boiv.a;
        f = new azwc("conversation_to_participants", 6);
        String[] strArr8 = bqsm.a;
        g = new azwc("message_star", 10);
        String[] strArr9 = bodn.a;
        h = new azwc("conversation_pin", 7);
        String[] strArr10 = bqkl.a;
        i = new azwc("message_reactions", 12);
        String[] strArr11 = bqmc.a;
        j = new azwc("message_replies", 13);
        String[] strArr12 = bqbb.a;
        k = new azwc("message_captions", 11);
        String[] strArr13 = btbt.a;
        l = new azwc("read_reports", 14);
        String[] strArr14 = bpxj.a;
        m = new azwc("link_preview", 15);
    }

    public static /* synthetic */ dqxe a(dqws dqwsVar, dqpo dqpoVar, dqpo dqpoVar2, final azwc azwcVar, final azwc azwcVar2) {
        azwcVar.getClass();
        azwcVar2.getClass();
        String[] strArr = bmkn.a;
        String[] strArr2 = bmkn.a;
        bmki bmkiVar = new bmki(strArr2);
        bmjt bmjtVar = bmkn.c;
        bmju bmjuVar = bmjtVar.c;
        bmkiVar.c(bmjuVar, bmjtVar.a);
        bmkiVar.d(new Function() { // from class: azvr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                azwc azwcVar3 = azvt.a;
                bmkmVar.g(azwcVar2.a);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqwsVar.v();
        bmki bmkiVar2 = new bmki(strArr2);
        bmkiVar2.v();
        bmkiVar2.d(new Function() { // from class: azvs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                azwc azwcVar3 = azvt.a;
                bmkmVar.g(azwcVar.a);
                bmkmVar.c(1L);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI = dqts.i(bmkiVar2.b(), bmjuVar, dqpoVar);
        ((dqos) dqtrVarI).e = "backup_table_join_map";
        dqtr dqtrVarI2 = dqts.i(dqwsVar.j(dqtrVarI).b(), dqpoVar2, bmjuVar);
        ((dqos) dqtrVarI2).e = "backup_id_map";
        return ((bmki) bmkiVar.j(dqtrVarI2)).b();
    }
}
