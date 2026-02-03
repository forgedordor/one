package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.MonthDay;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ ezgl c;
    final /* synthetic */ crgm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgk(fcxy fcxyVar, ConversationIdType conversationIdType, ezgl ezglVar, crgm crgmVar) {
        super(2, fcxyVar);
        this.b = conversationIdType;
        this.c = ezglVar;
        this.d = crgmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        MessageCoreData messageCoreDataQ;
        boolean z;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ConversationIdType conversationIdType = this.b;
            ekgb ekgbVarE = bbca.e(conversationIdType);
            if (((Boolean) ((cczi) czzm.a.get()).e()).booleanValue()) {
                ekqh it = ekgbVarE.iterator();
                it.getClass();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (bbca.r((ParticipantsTable.BindData) it.next())) {
                        z = true;
                        break;
                    }
                }
                ezgl ezglVar = this.c;
                ezglVar.copyOnWrite();
                ezgm ezgmVar = (ezgm) ezglVar.instance;
                ezgm ezgmVar2 = ezgm.a;
                ezgmVar.c = z;
            }
            if (!((Boolean) ((cczi) tet.b.get()).e()).booleanValue() || ekgbVarE.size() != 1) {
                return this.c.build();
            }
            aglr aglrVar = (aglr) this.d.c.b();
            this.a = 1;
            obj = ((bakh) aglrVar.b.b()).b(conversationIdType, aukf.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekgb ekgbVar = (ekgb) obj;
        if (ekgbVar.size() != 1) {
            return this.c.build();
        }
        String strO = ((bnfk) ekgbVar.get(0)).o();
        if (strO == null || strO.length() == 0) {
            return this.c.build();
        }
        crgm crgmVar = this.d;
        fcsu fcsuVar = crgmVar.a;
        Object objB = fcsuVar.b();
        objB.getClass();
        cogw cogwVar = (cogw) objB;
        MonthDay monthDay = MonthDay.parse(strO);
        ZonedDateTime zonedDateTimeTruncatedTo = LocalDateTime.of(cogwVar.g().getYear(), monthDay.getMonth(), monthDay.getDayOfMonth(), 0, 0, 0).y(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS);
        ZonedDateTime zonedDateTimePlusYears = zonedDateTimeTruncatedTo.plusYears(1L);
        Instant instant = zonedDateTimeTruncatedTo.toInstant();
        if (instant.isBefore(tep.b(cogwVar))) {
            instant = zonedDateTimePlusYears.toInstant();
            instant.getClass();
        } else {
            instant.getClass();
        }
        Object objB2 = fcsuVar.b();
        objB2.getClass();
        if (fdbq.f(instant, tep.b((cogw) objB2)) && (messageCoreDataQ = ((baxe) crgmVar.b.b()).q(this.b)) != null) {
            long jR = messageCoreDataQ.r();
            Object objB3 = fcsuVar.b();
            objB3.getClass();
            if (jR >= tep.a((cogw) objB3)) {
                return this.c.build();
            }
        }
        ezgl ezglVar2 = this.c;
        long epochMilli = instant.toEpochMilli();
        ezglVar2.copyOnWrite();
        ezgm ezgmVar3 = (ezgm) ezglVar2.instance;
        ezgm ezgmVar4 = ezgm.a;
        ezgmVar3.b = epochMilli;
        return ezglVar2.build();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crgk crgkVar = new crgk(fcxyVar, this.b, this.c, this.d);
        crgkVar.e = obj;
        return crgkVar;
    }
}
