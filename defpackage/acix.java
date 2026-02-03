package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acix implements acin {
    public final fcsu a;
    public final baeb b;
    public final bafp c;
    public final cwmi d;
    public final bbdl e;
    public final bael f;
    public final baes g;
    public final aqmq h;
    public List i = new ArrayList();
    public List j = new ArrayList();
    private final Context k;
    private final eosc l;

    public acix(Context context, eosc eoscVar, fcsu fcsuVar, baeb baebVar, bafp bafpVar, cwmi cwmiVar, bbdl bbdlVar, bael baelVar, baes baesVar, aqmq aqmqVar) {
        this.k = context;
        this.l = eoscVar;
        this.a = fcsuVar;
        this.b = baebVar;
        this.c = bafpVar;
        this.d = cwmiVar;
        this.e = bbdlVar;
        this.f = baelVar;
        this.g = baesVar;
        this.h = aqmqVar;
    }

    @Override // defpackage.acin
    public final eiju a() {
        return eijx.e(new HashMap());
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return eijx.g(new Callable() { // from class: aciv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                SelfIdentityId selfIdentityIdC;
                axcy axcyVarC;
                bojh bojhVarR;
                SelfIdentityId selfIdentityIdC2;
                axcy axcyVarC2;
                ArrayList arrayList = new ArrayList();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                acix acixVar = this.a;
                if (acixVar.h.a()) {
                    StringBuilder sb = new StringBuilder();
                    bfrj bfrjVar = (bfrj) acixVar.g.e((MessageIdType[]) acixVar.i.toArray(new MessageIdType[0])).p();
                    while (bfrjVar.moveToNext()) {
                        try {
                            baea baeaVarC = acixVar.b.c(bfrjVar);
                            ConversationIdType conversationIdTypeQ = baeaVarC.q();
                            if (!map.containsKey(conversationIdTypeQ)) {
                                bojh bojhVarR2 = ((bakt) acixVar.a.b()).r(conversationIdTypeQ);
                                bafo bafoVarA = acixVar.c.a(baga.c(conversationIdTypeQ).z());
                                if (bojhVarR2 != null) {
                                    map.put(conversationIdTypeQ, bojhVarR2);
                                }
                                map2.put(conversationIdTypeQ, bafoVarA);
                            }
                            bojh bojhVar = (bojh) map.get(conversationIdTypeQ);
                            bafo bafoVar = (bafo) map2.get(conversationIdTypeQ);
                            if (bojhVar != null && bafoVar != null && (selfIdentityIdC2 = aofa.c(bojhVar.T())) != null && (axcyVarC2 = acixVar.e.c(selfIdentityIdC2)) != null) {
                                sb.append(acixVar.d.a(baeaVarC, bafoVar, axcyVarC2, bojhVar.v()).b);
                            }
                        } finally {
                        }
                    }
                    bfrjVar.close();
                    string = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    bgvb bgvbVar = (bgvb) acixVar.f.f((MessageIdType[]) acixVar.i.toArray(new MessageIdType[0])).p();
                    while (bgvbVar.moveToNext()) {
                        try {
                            baea baeaVarE = acixVar.b.e(bgvbVar);
                            ConversationIdType conversationIdTypeQ2 = baeaVarE.q();
                            if (!map.containsKey(conversationIdTypeQ2)) {
                                bojh bojhVarR3 = ((bakt) acixVar.a.b()).r(conversationIdTypeQ2);
                                bafo bafoVarA2 = acixVar.c.a(baga.c(conversationIdTypeQ2).z());
                                if (bojhVarR3 != null) {
                                    map.put(conversationIdTypeQ2, bojhVarR3);
                                }
                                map2.put(conversationIdTypeQ2, bafoVarA2);
                            }
                            bojh bojhVar2 = (bojh) map.get(conversationIdTypeQ2);
                            bafo bafoVar2 = (bafo) map2.get(conversationIdTypeQ2);
                            if (bojhVar2 != null && bafoVar2 != null && (selfIdentityIdC = aofa.c(bojhVar2.T())) != null && (axcyVarC = acixVar.e.c(selfIdentityIdC)) != null) {
                                sb2.append(acixVar.d.a(baeaVarE, bafoVar2, axcyVarC, bojhVar2.v()).b);
                            }
                        } finally {
                        }
                    }
                    bgvbVar.close();
                    string = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                for (ConversationIdType conversationIdType : acixVar.j) {
                    if (!map.containsKey(conversationIdType) && (bojhVarR = ((bakt) acixVar.a.b()).r(conversationIdType)) != null) {
                        map.put(conversationIdType, bojhVarR);
                    }
                }
                Stream streamSorted = Collection.EL.stream(map.keySet()).sorted(Comparator.CC.comparingLong(new ToLongFunction() { // from class: aciw
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return ((ConversationIdType) obj).a;
                    }
                }));
                int i = ekgb.d;
                ekgb ekgbVar = (ekgb) streamSorted.collect(ekcv.a);
                int size = ekgbVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ConversationIdType conversationIdType2 = (ConversationIdType) ekgbVar.get(i2);
                    if (map.containsKey(conversationIdType2)) {
                        sb3.append(((bojh) map.get(conversationIdType2)).a());
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(new FileTeleporter(string.getBytes(StandardCharsets.UTF_8), "Problematic messages"));
                }
                if (!TextUtils.isEmpty(sb3.toString())) {
                    arrayList.add(new FileTeleporter(sb3.toString().getBytes(StandardCharsets.UTF_8), "Problematic conversations"));
                }
                return arrayList;
            }
        }, this.l);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }

    @Override // defpackage.acin
    public final elhx e() {
        return elhx.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_PROBLEMATIC_MESSAGES_ADVANCED_INFO;
    }

    @Override // defpackage.acin
    public final String f() {
        return this.k.getString(R.string.problematic_message_feedback_data_description);
    }

    @Override // defpackage.acin
    public final String g() {
        return this.k.getString(R.string.problematic_message_feedback_data_detail_title);
    }

    @Override // defpackage.acin
    public final String h() {
        return this.k.getString(R.string.problematic_message_feedback_data_name);
    }

    @Override // defpackage.acin
    public final String i() {
        return this.k.getString(R.string.problematic_message_feedback_data_rationale);
    }

    @Override // defpackage.acin
    public final String j() {
        return this.k.getString(R.string.problematic_message_feedback_data_rationale_title);
    }
}
