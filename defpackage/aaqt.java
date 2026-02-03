package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqt implements aari {
    static final cczv a = cdag.e(cdag.b, "donation_max_conversation_count", Alert.DURATION_SHOW_INDEFINITELY);
    static final cczv b = cdag.e(cdag.b, "donation_max_messages_per_conversation", 10);
    static final cczv c = cdag.h(cdag.b, "donation_include_sent_messages", false);
    static final cczv d = cdag.h(cdag.b, "donation_include_personal_messages", false);
    static final cczv e = cdag.h(cdag.b, "donation_include_group_conversations", false);
    public static final cczi f = cdag.c(cdag.b, "donation_edit_distance_threshold", 0.1d);
    public static final cqce g = cqce.g("Bugle", "AllMessagesDonationConversationCollector");
    public final fcsu h;
    public final aard i;
    private final eosc j;

    public aaqt(fcsu fcsuVar, eosc eoscVar, aard aardVar) {
        this.h = fcsuVar;
        this.j = eoscVar;
        this.i = aardVar;
    }

    @Override // defpackage.aari
    public final eiju a(Bundle bundle) {
        aaqu aaquVar = new aaqu();
        aaquVar.c(((Boolean) d.e()).booleanValue());
        aaquVar.b();
        aaquVar.d(((Boolean) c.e()).booleanValue());
        aaquVar.e(((Double) f.e()).doubleValue());
        aaquVar.f(aasj.a());
        aaquVar.a = bundle;
        final aarb aarbVarG = aaquVar.g();
        ecem.b();
        int iIntValue = ((Integer) a.e()).intValue();
        botb botbVarE = botm.e();
        botbVarE.A("+AllMessagesDonationConversationCollector#getConversationIds");
        botbVarE.c(botm.c.a);
        if (!((Boolean) e.e()).booleanValue()) {
            botbVarE.i(new Function() { // from class: aaqs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    cczi ccziVar = aaqt.f;
                    botlVar.A();
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        botbVarE.s();
        final ekgb ekgbVarG = botbVarE.b().g();
        int i = ((ekoe) ekgbVarG).c;
        g.m(a.e(i, "Found ", " conversationIds"));
        int iMin = Math.min(iIntValue, i);
        final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap(iMin));
        ArrayList arrayList = new ArrayList(iMin);
        for (final int i2 = 0; i2 < i && i2 < iIntValue; i2++) {
            arrayList.add(eijx.f(new Runnable() { // from class: aaqr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    List listN;
                    aarb aarbVar;
                    ekgb ekgbVarN;
                    List list;
                    cczv cczvVar;
                    aarb aarbVar2;
                    aaqt aaqtVar;
                    aaqw aaqwVar = new aaqw();
                    ConversationIdType conversationIdType = (ConversationIdType) ekgbVarG.get(i2);
                    double dIntValue = ((Integer) aaqt.b.e()).intValue();
                    aarb aarbVar3 = aarbVarG;
                    aaqt aaqtVar2 = this.a;
                    try {
                        int i3 = (int) (dIntValue * 1.5d);
                        listN = ((aaqv) aarbVar3).b ? ((baxe) aaqtVar2.h.b()).N(conversationIdType, i3) : ((baxe) aaqtVar2.h.b()).H(conversationIdType, i3);
                    } catch (Exception e2) {
                        cqbd cqbdVarE = aaqt.g.e();
                        cqbdVarE.I("#getFullMessages: Failed to load messages for conversation");
                        cqbdVarE.c(conversationIdType);
                        cqbdVarE.s(e2);
                        listN = null;
                    }
                    if (listN == null) {
                        int i4 = ekgb.d;
                        ekgbVarN = ekoe.a;
                        aarbVar = aarbVar3;
                    } else {
                        cczv cczvVar2 = aaqt.b;
                        ArrayList arrayList2 = new ArrayList(((Integer) cczvVar2.e()).intValue());
                        ArrayList arrayList3 = new ArrayList(((Integer) cczvVar2.e()).intValue());
                        HashMap map = new HashMap();
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < listN.size() && i6 < ((Integer) cczvVar2.e()).intValue()) {
                            aard aardVar = aaqtVar2.i;
                            aarg aargVarA = aardVar.a(aarbVar3, (MessageCoreData) listN.get(i5), map);
                            if (aargVarA != null) {
                                double d2 = ((aaqv) aarbVar3).c;
                                if (d2 == 0.0d) {
                                    list = listN;
                                    cczvVar = cczvVar2;
                                    aarbVar2 = aarbVar3;
                                    aaqtVar = aaqtVar2;
                                } else {
                                    list = listN;
                                    ekgb ekgbVarA = aardVar.b.a(((aaqz) aargVarA).c.toString());
                                    Iterator it = arrayList3.iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = it;
                                        ekgb ekgbVar = (ekgb) it.next();
                                        cczvVar = cczvVar2;
                                        aary aaryVar = aardVar.a;
                                        aarbVar2 = aarbVar3;
                                        aaqtVar = aaqtVar2;
                                        if (aary.a(ekgbVar, ekgbVarA)[ekgbVar.size()][((ekoe) ekgbVarA).c] <= ((int) (Math.max(ekgbVar.size(), r3) * d2))) {
                                            break;
                                        }
                                        cczvVar2 = cczvVar;
                                        it = it2;
                                        aaqtVar2 = aaqtVar;
                                        aarbVar3 = aarbVar2;
                                    }
                                    cczvVar = cczvVar2;
                                    aarbVar2 = aarbVar3;
                                    aaqtVar = aaqtVar2;
                                    arrayList3.add(ekgbVarA);
                                }
                                arrayList2.add(aargVarA);
                                i6++;
                            } else {
                                list = listN;
                                cczvVar = cczvVar2;
                                aarbVar2 = aarbVar3;
                                aaqtVar = aaqtVar2;
                            }
                            i5++;
                            listN = list;
                            cczvVar2 = cczvVar;
                            aaqtVar2 = aaqtVar;
                            aarbVar3 = aarbVar2;
                        }
                        aarbVar = aarbVar3;
                        ekgbVarN = ekgb.n(arrayList2);
                    }
                    if (ekgbVarN.isEmpty()) {
                        return;
                    }
                    cczv cczvVar3 = aaqt.e;
                    if (!((Boolean) cczvVar3.e()).booleanValue() || !((aaqv) aarbVar).b) {
                        String strD = ((aarg) ekgbVarN.get(0)).d();
                        for (int i7 = 1; i7 < ekgbVarN.size(); i7++) {
                            aarg aargVar = (aarg) ekgbVarN.get(i7);
                            if (!((aaqv) aarbVar).b && !aargVar.e()) {
                                aaqt.g.r("#conversationSatisfiesRequest: request excludes sent message but message was sent");
                                return;
                            } else {
                                if (!((Boolean) cczvVar3.e()).booleanValue() && aargVar.e() && !TextUtils.equals(strD, ((aarg) ekgbVarN.get(i7)).d())) {
                                    aaqt.g.r("#conversationSatifiesRequest: request excludes group conversations, but single participant conversation had multiple incoming destinations");
                                    return;
                                }
                            }
                        }
                    }
                    Set set = setNewSetFromMap;
                    aaqwVar.b(ekgbVarN);
                    set.add(aaqwVar.c());
                }
            }, this.j));
        }
        return eijx.l(arrayList).a(new Callable() { // from class: aaqq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cczi ccziVar = aaqt.f;
                return ekgb.n(setNewSetFromMap);
            }
        }, this.j);
    }
}
