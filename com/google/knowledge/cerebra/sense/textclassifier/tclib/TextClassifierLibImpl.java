package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.app.Person;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.textclassifier.ConversationAction;
import android.view.textclassifier.ConversationActions;
import android.view.textclassifier.TextClassifier;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.AnnotatorModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.DocumentsAnnotatorModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.GuardedNativeModels;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.LangIdModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.RemoteActionTemplate;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl;
import defpackage.csq;
import defpackage.ejvo;
import defpackage.ejvp;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekgp;
import defpackage.ekoe;
import defpackage.eooi;
import defpackage.eooq;
import defpackage.eoqg;
import defpackage.eork;
import defpackage.eorv;
import defpackage.eosc;
import defpackage.eufr;
import defpackage.euft;
import defpackage.eufu;
import defpackage.eufv;
import defpackage.eufx;
import defpackage.eufy;
import defpackage.eugq;
import defpackage.eugr;
import defpackage.eugt;
import defpackage.eugw;
import defpackage.eugz;
import defpackage.euhb;
import defpackage.euhd;
import defpackage.euhf;
import defpackage.euhz;
import defpackage.euia;
import defpackage.euib;
import defpackage.euid;
import defpackage.euie;
import defpackage.euig;
import defpackage.euih;
import defpackage.eujb;
import defpackage.eujc;
import defpackage.euje;
import defpackage.eujf;
import defpackage.eujm;
import defpackage.eujn;
import defpackage.eujq;
import defpackage.eujt;
import defpackage.eujw;
import defpackage.eujx;
import defpackage.eujy;
import defpackage.euka;
import defpackage.eukb;
import defpackage.eukc;
import defpackage.eukg;
import defpackage.eukj;
import defpackage.eukz;
import defpackage.eulb;
import defpackage.eulc;
import defpackage.eulf;
import defpackage.euli;
import defpackage.eulj;
import defpackage.eulk;
import defpackage.eulp;
import defpackage.eult;
import defpackage.kxj;
import defpackage.lah;
import j$.time.TimeConversions;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TextClassifierLibImpl extends TextClassifierLib {
    private eulc A;
    private boolean C;
    private boolean D;
    private final eujm E;
    public final ListenableFuture c;
    public final eulf d;
    public final euhz e;
    public final eujc f;
    public AnnotatorModel j;
    public GuardedNativeModels k;
    public eufx l;
    public DocumentsAnnotatorModel m;
    public LangIdModel n;
    public eufx o;
    public ActionsSuggestionsModel p;
    public eufx q;
    private final eujq t;
    private final Context u;
    private final eujf v;
    private final eujf w;
    private Date z;
    private static final boolean r = Log.isLoggable("TextClassifierLibImpl", 3);
    private static final long s = TimeUnit.HOURS.toMillis(1);
    public static final ekgb a = ekgb.x("address", "email", "phone", "url", "date", "datetime", "flight");
    public static final ekgb b = ekgb.C("view_calendar", "view_map", "track_flight", "open_url", "send_sms", "call_phone", "send_email", "text_reply", "create_reminder", "share_location", "add_contact", "copy", new String[0]);
    public final ReadWriteLock g = new ReentrantReadWriteLock();
    public final ReadWriteLock h = new ReentrantReadWriteLock();
    public final ReadWriteLock i = new ReentrantReadWriteLock();
    private final ReadWriteLock x = new ReentrantReadWriteLock();
    private final Object y = new Object();
    private final Object B = new Object();

    public TextClassifierLibImpl(Context context, eulf eulfVar, eujm eujmVar) {
        if (r) {
            int iMyPid = Process.myPid();
            Log.d("TextClassifierLibImpl", "Init in " + context.getPackageName() + " (PID " + iMyPid + ")");
        }
        context.getClass();
        this.u = context;
        this.d = eulfVar;
        this.E = eujmVar;
        eujq eujqVar = new eujq(new eukz(this));
        this.t = eujqVar;
        eujf eujeVar = new euje(new ejvr() { // from class: eula
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.j((euli) obj);
            }
        }, new ejxr() { // from class: eukl
            @Override // defpackage.ejxr
            public final Object get() {
                TextClassifierLibImpl textClassifierLibImpl = this.a;
                textClassifierLibImpl.h.readLock().lock();
                try {
                    LangIdModel langIdModel = textClassifierLibImpl.n;
                    return langIdModel == null ? ejud.a : ejwi.j(Float.valueOf(langIdModel.nativeGetLangIdThreshold(langIdModel.a)));
                } finally {
                    textClassifierLibImpl.h.readLock().unlock();
                }
            }
        }, new ejxr() { // from class: eukm
            @Override // defpackage.ejxr
            public final Object get() {
                TextClassifierLibImpl textClassifierLibImpl = this.a;
                textClassifierLibImpl.h.readLock().lock();
                try {
                    return ejwi.i(textClassifierLibImpl.o);
                } finally {
                    textClassifierLibImpl.h.readLock().unlock();
                }
            }
        });
        this.v = eujeVar;
        euhb euhbVar = (euhb) eulfVar;
        this.w = euhbVar.c.isEmpty() ? eujeVar : new eujt(euhbVar.c);
        this.e = new euhz(context, euhbVar.b);
        this.f = new eujc();
        this.c = eooq.f(eujqVar.a(), new ejvr() { // from class: eukn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a;
            }
        }, eoqg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.euix m(com.google.knowledge.cerebra.sense.textclassifier.lib3.AnnotatorModel.ClassificationResult r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl.m(com.google.knowledge.cerebra.sense.textclassifier.lib3.AnnotatorModel$ClassificationResult, int, int):euix");
    }

    private static String n(lah lahVar) {
        return lahVar == null ? "" : lahVar.e();
    }

    private final void o() {
        Date date = new Date();
        synchronized (this.y) {
            boolean z = false;
            if (this.z != null && date.getTime() < this.z.getTime() + s) {
                z = true;
            }
            eugz eugzVar = new eugz(kxj.c(this.E.a, "android.permission.READ_CONTACTS"));
            if (z && eugzVar.equals(this.A)) {
                Log.d("TextClassifierLibImpl", "Skipping async model load. Loaded recently, no change to permissions.");
                return;
            }
            this.z = date;
            this.A = eugzVar;
            final ListenableFuture listenableFutureA = this.t.a();
            listenableFutureA.b(new Runnable() { // from class: eujo
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ((eooi) listenableFutureA).q();
                    } catch (Throwable th) {
                        Log.w("TCRefreshRunner", "Refresh run failed.", th);
                    }
                }
            }, eoqg.a);
        }
    }

    @Override // defpackage.eukg
    public final eukb a(euka eukaVar) {
        return i(new eujw(eukaVar));
    }

    @Override // defpackage.eukg
    public final eult b(eulp eulpVar) {
        ekgp ekgpVar = eujy.a;
        return g(eujx.a(null, null, eulpVar));
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public final ListenableFuture d() {
        if (r) {
            Log.d("TextClassifierLibImpl", "close() in PID " + Process.myPid());
        }
        synchronized (this.B) {
            ejwl.l(!this.C);
            this.C = true;
        }
        return eooq.f(this.t.a(), new ejvr() { // from class: eukr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = TextClassifierLibImpl.a;
                return null;
            }
        }, eoqg.a);
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public final ListenableFuture e() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public final euih f(euig euigVar) {
        RemoteActionCompat remoteActionCompat;
        int i;
        ActionsSuggestionsModel.ConversationMessage[] conversationMessageArr;
        int iIntValue;
        ReadWriteLock readWriteLock;
        ReadWriteLock readWriteLock2;
        euih euihVarA;
        int i2;
        ReadWriteLock readWriteLock3;
        Collection collection;
        ReadWriteLock readWriteLock4;
        RemoteActionCompat remoteActionCompat2;
        euft euftVarB;
        if (r) {
            Log.d("TextClassifierLibImpl", "suggestConversationActions in PID " + Process.myPid());
        }
        try {
            ((eooi) this.c).q();
            o();
            ReadWriteLock readWriteLock5 = this.g;
            readWriteLock5.readLock().lock();
            ReadWriteLock readWriteLock6 = this.i;
            readWriteLock6.readLock().lock();
            try {
                if (this.p == null) {
                    int i3 = ekgb.d;
                    return euih.d(ekoe.a).a();
                }
                List<euie> list = euigVar.a;
                eujf eujfVar = this.w;
                ArrayList arrayList = new ArrayList();
                for (euie euieVar : list) {
                    if (!TextUtils.isEmpty(euieVar.d)) {
                        arrayList.add(euieVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    conversationMessageArr = new ActionsSuggestionsModel.ConversationMessage[0];
                    remoteActionCompat = null;
                    i = 1;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    ejvp ejvpVar = eugq.a;
                    csq csqVar = new csq();
                    int i4 = 1;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        euie euieVar2 = (euie) arrayList.get(size);
                        ejvo ejvoVar = new ejvo(eugq.a, euieVar2.c);
                        if (eugq.b.equals(ejvoVar)) {
                            iIntValue = 0;
                        } else {
                            Integer numValueOf = (Integer) csqVar.get(ejvoVar);
                            if (numValueOf == null) {
                                numValueOf = Integer.valueOf(i4);
                                csqVar.put(ejvoVar, numValueOf);
                                i4++;
                            }
                            iIntValue = numValueOf.intValue();
                        }
                        CharSequence charSequence = euieVar2.d;
                        arrayDeque.push(new ActionsSuggestionsModel.ConversationMessage(iIntValue, charSequence.toString(), TimeZone.getDefault().getID(), eujfVar.b(charSequence)));
                    }
                    remoteActionCompat = null;
                    i = 1;
                    conversationMessageArr = (ActionsSuggestionsModel.ConversationMessage[]) arrayDeque.toArray(new ActionsSuggestionsModel.ConversationMessage[arrayDeque.size()]);
                }
                if (conversationMessageArr.length == 0) {
                    int i5 = ekgb.d;
                    euihVarA = euih.d(ekoe.a).a();
                    readWriteLock = readWriteLock5;
                    readWriteLock2 = readWriteLock6;
                } else {
                    ActionsSuggestionsModel.Conversation conversation = new ActionsSuggestionsModel.Conversation(conversationMessageArr);
                    ActionsSuggestionsModel actionsSuggestionsModel = this.p;
                    Context context = this.u;
                    String strA = eufr.a(context);
                    AnnotatorModel annotatorModel = this.j;
                    ActionsSuggestionsModel.ActionSuggestions actionSuggestionsNativeSuggestActions = actionsSuggestionsModel.nativeSuggestActions(actionsSuggestionsModel.a, conversation, null, annotatorModel != null ? annotatorModel.a() : 0L, context, strA, true);
                    Collection collectionB = euigVar.b.b(b);
                    ArrayList<euib> arrayList2 = new ArrayList();
                    ActionsSuggestionsModel.ActionSuggestion[] actionSuggestionArr = actionSuggestionsNativeSuggestActions.a;
                    int length = actionSuggestionArr.length;
                    int i6 = 0;
                    while (i6 < length) {
                        ActionsSuggestionsModel.ActionSuggestion actionSuggestion = actionSuggestionArr[i6];
                        String str = actionSuggestion.b;
                        if (collectionB.contains(str)) {
                            ArrayList arrayList3 = new ArrayList();
                            ActionsSuggestionsModel.Slot[] slotArr = actionSuggestion.g;
                            if (slotArr != null) {
                                readWriteLock3 = readWriteLock5;
                                int length2 = slotArr.length;
                                collection = collectionB;
                                int i7 = 0;
                                while (i7 < length2) {
                                    int i8 = length2;
                                    ActionsSuggestionsModel.Slot slot = slotArr[i7];
                                    arrayList3.add(new eugw(slot.a, slot.b, slot.c, slot.d, slot.e));
                                    i7++;
                                    length2 = i8;
                                }
                            } else {
                                readWriteLock3 = readWriteLock5;
                                collection = collectionB;
                            }
                            str.getClass();
                            float f = actionSuggestion.c;
                            String str2 = actionSuggestion.a;
                            ekgb ekgbVarN = ekgb.n(arrayList3);
                            Bundle bundle = new Bundle();
                            RemoteActionTemplate[] remoteActionTemplateArr = actionSuggestion.f;
                            ekgb ekgbVarB = remoteActionTemplateArr == null ? ekoe.a : eufv.b(remoteActionTemplateArr);
                            if (ekgbVarB.isEmpty() || (euftVarB = ((eufu) ekgbVarB.get(0)).b(context)) == null) {
                                readWriteLock4 = readWriteLock6;
                                remoteActionCompat2 = remoteActionCompat;
                            } else {
                                remoteActionCompat2 = euftVarB.b;
                                readWriteLock4 = readWriteLock6;
                                bundle.putParcelable("action-intent", euftVarB.a);
                            }
                            bundle.putByteArray("serialized-entities-data", actionSuggestion.e);
                            bundle.putParcelable("entities-extras", eufv.a(actionSuggestion.d));
                            arrayList2.add(euia.a(remoteActionCompat2, str2, bundle, ekgbVarN));
                        } else {
                            readWriteLock3 = readWriteLock5;
                            collection = collectionB;
                            readWriteLock4 = readWriteLock6;
                        }
                        i6++;
                        collectionB = collection;
                        readWriteLock5 = readWriteLock3;
                        readWriteLock6 = readWriteLock4;
                    }
                    readWriteLock = readWriteLock5;
                    readWriteLock2 = readWriteLock6;
                    csq csqVar2 = new csq();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Pair pairA = eugr.a((euib) it.next());
                        if (pairA != null) {
                            csqVar2.put(pairA, Integer.valueOf((csqVar2.containsKey(pairA) ? ((Integer) csqVar2.get(pairA)).intValue() : 0) + 1));
                        }
                    }
                    List arrayList4 = new ArrayList();
                    for (euib euibVar : arrayList2) {
                        Pair pairA2 = eugr.a(euibVar);
                        if (pairA2 == null || ((Integer) csqVar2.get(pairA2)).intValue() == (i2 = i)) {
                            arrayList4.add(euibVar);
                            i = 1;
                        } else {
                            i = i2;
                        }
                    }
                    if (arrayList4.size() > 4) {
                        arrayList4 = arrayList4.subList(0, 4);
                    }
                    ejwi ejwiVarI = ejwi.i(this.q);
                    ejwi ejwiVarI2 = ejwi.i(this.l);
                    ejwi ejwiVarA = eujfVar.a();
                    int i9 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    for (euie euieVar3 : list) {
                        ekfwVar.h(Integer.valueOf(Arrays.hashCode(new Object[]{euieVar3.c, euieVar3.d, remoteActionCompat})));
                    }
                    String strA2 = eufy.a(Arrays.hashCode(new Object[]{ekfwVar, context.getPackageName()}), ekgb.t(ejwiVarI, ejwiVarI2, ejwiVarA));
                    euid euidVarD = euih.d(arrayList4);
                    ((eugt) euidVarD).b = strA2;
                    euidVarD.b(actionSuggestionsNativeSuggestActions.b);
                    euihVarA = euidVarD.a();
                }
                readWriteLock.readLock().unlock();
                readWriteLock2.readLock().unlock();
                return euihVarA;
            } finally {
                this.g.readLock().unlock();
                this.i.readLock().unlock();
            }
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (!((euhb) this.d).a) {
                throw new IllegalStateException("Failed to initialize.", e);
            }
            Log.w("TextClassifierLibImpl", "Failed to initialize, using the fallback.");
            eukg eukgVar = eukc.a(this.u).a;
            eujn.c();
            if (Build.VERSION.SDK_INT < 29) {
                eukg.c();
                int i10 = ekgb.d;
                return euih.d(ekoe.a).a();
            }
            TextClassifier textClassifier = ((eujn) eukgVar).a;
            ConversationActions.Request.Builder typeConfig = new ConversationActions.Request.Builder((List) Collection.EL.stream(euigVar.a).map(new Function() { // from class: euif
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    euie euieVar4 = (euie) obj;
                    kxa kxaVar = euieVar4.c;
                    Person.Builder name = new Person.Builder().setName(kxaVar.a);
                    IconCompat iconCompat = kxaVar.b;
                    return new ConversationActions.Message.Builder(name.setIcon(iconCompat != null ? iconCompat.c() : null).setUri(kxaVar.c).setKey(kxaVar.d).setBot(kxaVar.e).setImportant(kxaVar.f).build()).setText(euieVar4.d).setReferenceTime(TimeConversions.convert((ZonedDateTime) null)).setExtras(euieVar4.e).build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList())).setHints(euigVar.c).setExtras(euigVar.d).setTypeConfig(euigVar.b.a());
            typeConfig.setMaxSuggestions(4);
            ConversationActions conversationActionsSuggestConversationActions = textClassifier.suggestConversationActions(typeConfig.build());
            if (conversationActionsSuggestConversationActions == null) {
                return null;
            }
            euid euidVarD2 = euih.d((List) Collection.EL.stream(conversationActionsSuggestConversationActions.getConversationActions()).map(new Function() { // from class: euic
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ConversationAction conversationActionM489m = ied$$ExternalSyntheticApiModelOutline0.m489m(obj);
                    if (conversationActionM489m == null) {
                        return null;
                    }
                    conversationActionM489m.getType().getClass();
                    RemoteActionCompat remoteActionCompatA = conversationActionM489m.getAction() == null ? null : RemoteActionCompat.a(conversationActionM489m.getAction());
                    conversationActionM489m.getConfidenceScore();
                    return euia.a(remoteActionCompatA, conversationActionM489m.getTextReply(), conversationActionM489m.getExtras(), null);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()));
            ((eugt) euidVarD2).b = conversationActionsSuggestConversationActions.getId();
            return euidVarD2.a();
        }
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public final eult g(eujy eujyVar) {
        int i;
        AnnotatorModel.AnnotatedSpan[] annotatedSpanArr;
        if (r) {
            Log.d("TextClassifierLibImpl", "generateLinks in PID " + Process.myPid());
        }
        try {
            ((eooi) this.c).q();
            o();
            eulp eulpVar = eujyVar.b;
            String string = eulpVar.a.toString();
            String strN = n(null);
            string.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList<List> arrayList2 = new ArrayList();
            java.util.Collection collectionB = eulpVar.b.b(a);
            ReadWriteLock readWriteLock = this.g;
            readWriteLock.readLock().lock();
            try {
                if (this.j != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String id = TimeZone.getDefault().getID();
                    AnnotatorModel annotatorModel = this.j;
                    AnnotatorModel.AnnotatedSpan[] annotatedSpanArrNativeAnnotate = annotatorModel.nativeAnnotate(annotatorModel.a, string, new AnnotatorModel.AnnotationOptions(jCurrentTimeMillis, id, strN, this.v.b(string), collectionB, ((eukj) eujy.a.getOrDefault(Integer.valueOf(eulpVar.c.deepCopy().getInt("textclassifier.extras.ANNOTATION_USECASE")), eukj.SMART)).c));
                    if (annotatedSpanArrNativeAnnotate == null) {
                        Log.e("TextClassifierLibImpl", "[generateLinks] nativeClassifier.annotate returns null!");
                    } else {
                        int length = annotatedSpanArrNativeAnnotate.length;
                        int i2 = 0;
                        while (i2 < length) {
                            AnnotatorModel.AnnotatedSpan annotatedSpan = annotatedSpanArrNativeAnnotate[i2];
                            csq csqVar = new csq();
                            AnnotatorModel.ClassificationResult[] classificationResultArr = annotatedSpan.c;
                            int length2 = classificationResultArr.length;
                            if (length2 == 0) {
                                i = length;
                                annotatedSpanArr = annotatedSpanArrNativeAnnotate;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                int i3 = 0;
                                while (i3 < length2) {
                                    AnnotatorModel.ClassificationResult classificationResult = classificationResultArr[i3];
                                    csqVar.put(classificationResult.a, Float.valueOf(classificationResult.b));
                                    arrayList3.add(m(classificationResult, annotatedSpan.a, annotatedSpan.b));
                                    i3++;
                                    length = length;
                                    annotatedSpanArrNativeAnnotate = annotatedSpanArrNativeAnnotate;
                                }
                                i = length;
                                annotatedSpanArr = annotatedSpanArrNativeAnnotate;
                                eulk.b(annotatedSpan.a, annotatedSpan.b, csqVar, arrayList);
                                arrayList2.add(arrayList3);
                            }
                            i2++;
                            length = i;
                            annotatedSpanArrNativeAnnotate = annotatedSpanArr;
                        }
                    }
                }
                if (this.j == null && ((euhb) this.d).a) {
                    readWriteLock.readLock().unlock();
                    return eukc.a(this.u).a.b(eulpVar);
                }
                ArrayList<Bundle> arrayList4 = new ArrayList();
                for (List list : arrayList2) {
                    Bundle bundle = new Bundle();
                    eujb.a(list, bundle);
                    arrayList4.add(bundle);
                }
                Bundle bundle2 = new Bundle();
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                for (Bundle bundle3 : arrayList4) {
                    bundle3.getClass();
                    arrayList5.add(bundle3.deepCopy());
                }
                bundle2.putParcelableArrayList("gms.textclassifier.text_link_extras", arrayList5);
                eult eultVarA = eulk.a(string, arrayList, bundle2);
                readWriteLock.readLock().unlock();
                return eultVarA;
            } catch (Throwable th) {
                this.g.readLock().unlock();
                throw th;
            }
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (!((euhb) this.d).a) {
                throw new IllegalStateException("Failed to initialize.", e);
            }
            Log.w("TextClassifierLibImpl", "Failed to initialize, using the fallback.");
            return eukc.a(this.u).a.b(eujyVar.b);
        }
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public long getNativeGuardedNativeModelsPointer() {
        return this.k.a();
    }

    public final ListenableFuture h(eosc eoscVar) {
        synchronized (this.B) {
            if (this.D) {
                return eork.i(eulb.a);
            }
            if (this.C) {
                this.D = true;
                return eoscVar.submit(new Callable() { // from class: eukk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        elee eleeVar = new elee();
                        final TextClassifierLibImpl textClassifierLibImpl = this.a;
                        eleeVar.a(new Closeable() { // from class: euko
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                textClassifierLibImpl.l();
                            }
                        });
                        eleeVar.a(new Closeable() { // from class: eukp
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                TextClassifierLibImpl textClassifierLibImpl2 = textClassifierLibImpl;
                                textClassifierLibImpl2.h.writeLock().lock();
                                try {
                                    LangIdModel langIdModel = textClassifierLibImpl2.n;
                                    if (langIdModel != null) {
                                        langIdModel.close();
                                        textClassifierLibImpl2.n = null;
                                        textClassifierLibImpl2.o = null;
                                    }
                                } finally {
                                    textClassifierLibImpl2.h.writeLock().unlock();
                                }
                            }
                        });
                        eleeVar.a(new Closeable() { // from class: eukq
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                textClassifierLibImpl.k();
                            }
                        });
                        eleeVar.a(textClassifierLibImpl.k);
                        euhb euhbVar = (euhb) textClassifierLibImpl.d;
                        eleeVar.a(euhbVar.d);
                        eleeVar.a(euhbVar.e);
                        eleeVar.a(euhbVar.f);
                        eleeVar.a(euhbVar.g);
                        eleeVar.a(euhbVar.h);
                        eleeVar.a(euhbVar.i);
                        eleeVar.a(euhbVar.j);
                        eleeVar.a(textClassifierLibImpl.e);
                        eleeVar.a(textClassifierLibImpl.m);
                        eleeVar.a(euhbVar.k);
                        eleeVar.close();
                        return eulb.a;
                    }
                });
            }
            synchronized (this.y) {
                this.z = new Date();
            }
            if (this.k == null) {
                try {
                    this.k = new GuardedNativeModels();
                } catch (UnsatisfiedLinkError e) {
                    return eork.h(e);
                }
            }
            this.x.writeLock().lock();
            try {
                try {
                    if (this.m == null) {
                        this.m = new DocumentsAnnotatorModel();
                    }
                    this.x.writeLock().unlock();
                    ListenableFuture listenableFuture = eorv.a;
                    final euhz euhzVar = this.e;
                    euhzVar.getClass();
                    this.f.getClass();
                    ListenableFuture listenableFutureF = eooq.f(eork.f(listenableFuture, listenableFuture, listenableFuture, listenableFuture, eoscVar.submit(new Callable() { // from class: euks
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Can't wrap try/catch for region: R(15:5|(6:120|6|7|118|8|9)|(8:(2:137|10)|(3:129|12|(6:14|(1:23)(4:20|21|126|22)|24|25|(1:(1:(1:(1:141)(2:45|142))(2:46|143))(2:47|144))(2:48|145)|44)(18:140|51|(1:53)|67|(2:70|68)|146|71|(4:74|(2:76|148)(1:149)|77|72)|147|78|121|79|128|80|(4:82|131|83|(1:85))|97|107|(2:109|110)(1:154)))|128|80|(0)|97|107|(0)(0))|139|51|(0)|67|(1:68)|146|71|(1:72)|147|78|121|79) */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:109:0x02ba  */
                        /* JADX WARN: Removed duplicated region for block: B:114:0x02c3  */
                        /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
                        /* JADX WARN: Removed duplicated region for block: B:53:0x00fa A[PHI: r3 r8 r9 r17
                          0x00fa: PHI (r3v6 boolean) = (r3v14 boolean), (r3v15 boolean) binds: [B:65:0x0119, B:52:0x00f8] A[DONT_GENERATE, DONT_INLINE]
                          0x00fa: PHI (r8v2 android.database.Cursor) = (r8v15 android.database.Cursor), (r8v18 android.database.Cursor) binds: [B:65:0x0119, B:52:0x00f8] A[DONT_GENERATE, DONT_INLINE]
                          0x00fa: PHI (r9v3 java.util.HashMap) = (r9v7 java.util.HashMap), (r9v11 java.util.HashMap) binds: [B:65:0x0119, B:52:0x00f8] A[DONT_GENERATE, DONT_INLINE]
                          0x00fa: PHI (r17v4 android.database.Cursor) = (r17v6 android.database.Cursor), (r17v7 android.database.Cursor) binds: [B:65:0x0119, B:52:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:70:0x012e A[LOOP:1: B:68:0x0125->B:70:0x012e, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:74:0x01bd  */
                        /* JADX WARN: Removed duplicated region for block: B:82:0x0264 A[Catch: all -> 0x0274, TRY_LEAVE, TryCatch #7 {all -> 0x0274, blocks: (B:80:0x025d, B:82:0x0264, B:85:0x0270, B:96:0x0282, B:95:0x027f, B:83:0x026a, B:92:0x027a), top: B:128:0x025d, inners: #9, #11 }] */
                        /* JADX WARN: Type inference failed for: r3v11 */
                        /* JADX WARN: Type inference failed for: r3v12 */
                        /* JADX WARN: Type inference failed for: r3v13 */
                        /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object call() throws java.lang.Throwable {
                            /*
                                Method dump skipped, instructions count: 730
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.euks.call():java.lang.Object");
                        }
                    }), eoscVar.submit(new Callable() { // from class: eukt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    })), new ejvr() { // from class: euku
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x0384, TRY_ENTER, TryCatch #4 {all -> 0x0384, blocks: (B:8:0x0036, B:28:0x0080, B:31:0x00b5, B:33:0x00cb), top: B:165:0x0036 }] */
                        @Override // defpackage.ejvr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object apply(java.lang.Object r22) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instructions count: 990
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.euku.apply(java.lang.Object):java.lang.Object");
                        }
                    }, eoscVar);
                    ListenableFuture listenableFutureF2 = eooq.f(listenableFuture, new ejvr() { // from class: eukv
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r11v12, types: [java.util.concurrent.locks.Lock] */
                        /* JADX WARN: Type inference failed for: r11v2, types: [com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl] */
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            LangIdModel langIdModel;
                            TextClassifierLibImpl textClassifierLibImplWriteLock = this.a;
                            try {
                                eujl eujlVarA = ((euhb) textClassifierLibImplWriteLock.d).e.a();
                                try {
                                    if (((eugv) eujlVarA).a) {
                                        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) ((eugv) eujlVarA).b;
                                        if (assetFileDescriptor != null) {
                                            try {
                                                langIdModel = new LangIdModel(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                            } catch (IllegalArgumentException e2) {
                                                throw new eujk("Could not load LangId model from ".concat(assetFileDescriptor.toString()), e2);
                                            }
                                        } else {
                                            langIdModel = null;
                                        }
                                        textClassifierLibImplWriteLock.k.d(langIdModel);
                                        textClassifierLibImplWriteLock.h.writeLock().lock();
                                        try {
                                            if (langIdModel != null) {
                                                textClassifierLibImplWriteLock.n = langIdModel;
                                                textClassifierLibImplWriteLock.o = new eufx(langIdModel.a(), "*");
                                                Log.d("TextClassifierLibImpl", a.v(textClassifierLibImplWriteLock.o.a, "Loaded langID model: "));
                                            } else {
                                                textClassifierLibImplWriteLock.n = null;
                                                textClassifierLibImplWriteLock.o = null;
                                            }
                                            textClassifierLibImplWriteLock = textClassifierLibImplWriteLock.h.writeLock();
                                            textClassifierLibImplWriteLock.unlock();
                                        } catch (Throwable th) {
                                            textClassifierLibImplWriteLock.h.writeLock().unlock();
                                            throw th;
                                        }
                                    } else {
                                        Log.d("TextClassifierLibImpl", "Skipping asynchronous LangId reload. No model change.");
                                    }
                                    eujlVarA.close();
                                    return eulb.a;
                                } finally {
                                }
                            } catch (eujk e3) {
                                throw new eujr("Failed to load the native LangId.", e3);
                            }
                        }
                    }, eoscVar);
                    return eooq.f(eork.f(listenableFutureF, listenableFutureF2, eooq.f(eork.f(listenableFuture, listenableFuture), new ejvr() { // from class: eukw
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            euge eugeVar;
                            TextClassifierLibImpl textClassifierLibImpl = this.a;
                            try {
                                eulf eulfVar = textClassifierLibImpl.d;
                                eujl eujlVarA = ((euhb) eulfVar).f.a();
                                try {
                                    eujl eujlVarA2 = ((euhb) eulfVar).k.a();
                                    try {
                                        if (((eugv) eujlVarA).a || ((eugv) eujlVarA2).a) {
                                            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) ((eugv) eujlVarA).b;
                                            euij euijVar = (euij) ((eugv) eujlVarA2).b;
                                            ActionsSuggestionsModel actionsSuggestionsModel = null;
                                            if (euijVar == null) {
                                                eugeVar = null;
                                            } else {
                                                eugd eugdVar = (eugd) euge.a.createBuilder();
                                                String strB = eugr.b(euijVar.b());
                                                eugdVar.copyOnWrite();
                                                euge eugeVar2 = (euge) eugdVar.instance;
                                                strB.getClass();
                                                eugeVar2.b |= 1;
                                                eugeVar2.c = strB;
                                                String strB2 = eugr.b(euijVar.a());
                                                eugdVar.copyOnWrite();
                                                euge eugeVar3 = (euge) eugdVar.instance;
                                                strB2.getClass();
                                                eugeVar3.b |= 2;
                                                eugeVar3.d = strB2;
                                                eugeVar = (euge) eugdVar.build();
                                            }
                                            if (assetFileDescriptor != null) {
                                                try {
                                                    actionsSuggestionsModel = new ActionsSuggestionsModel(assetFileDescriptor);
                                                    if (eugeVar != null) {
                                                        if (!actionsSuggestionsModel.nativeInitializeConversationIntentDetection(actionsSuggestionsModel.a, eugeVar.toByteArray())) {
                                                            throw new IllegalArgumentException("Couldn't initialize conversation intent detection");
                                                        }
                                                    }
                                                } catch (IllegalArgumentException e2) {
                                                    throw new eujk("Could not load actions model from ".concat(assetFileDescriptor.toString()), e2);
                                                }
                                            }
                                            textClassifierLibImpl.k.b(actionsSuggestionsModel);
                                            textClassifierLibImpl.i.writeLock().lock();
                                            try {
                                                textClassifierLibImpl.k();
                                                if (actionsSuggestionsModel != null) {
                                                    int iNativeGetVersionWithOffset = ActionsSuggestionsModel.nativeGetVersionWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                                    String strNativeGetLocalesWithOffset = ActionsSuggestionsModel.nativeGetLocalesWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                                    textClassifierLibImpl.p = actionsSuggestionsModel;
                                                    textClassifierLibImpl.q = new eufx(iNativeGetVersionWithOffset, strNativeGetLocalesWithOffset);
                                                    Log.d("TextClassifierLibImpl", a.v(textClassifierLibImpl.q.a, "Loaded actions model: "));
                                                }
                                            } finally {
                                                textClassifierLibImpl.i.writeLock().unlock();
                                            }
                                        } else {
                                            Log.d("TextClassifierLibImpl", "Skipping asynchronous actions model reload. No model change.");
                                        }
                                        eujlVarA2.close();
                                        eujlVarA.close();
                                        return eulb.a;
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (eujk e3) {
                                throw new eujr("Failed to load the native actions model.", e3);
                            }
                        }
                    }, eoscVar), eooq.f(eork.f(listenableFutureF, listenableFutureF2), new ejvr() { // from class: eukx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            AnnotatorModel annotatorModel;
                            TextClassifierLibImpl textClassifierLibImpl = this.a;
                            textClassifierLibImpl.g.writeLock().lock();
                            textClassifierLibImpl.h.readLock().lock();
                            try {
                                LangIdModel langIdModel = textClassifierLibImpl.n;
                                if (langIdModel != null && (annotatorModel = textClassifierLibImpl.j) != null) {
                                    annotatorModel.b = langIdModel;
                                    annotatorModel.nativeSetLangId(annotatorModel.a, langIdModel.a);
                                }
                                textClassifierLibImpl.h.readLock().unlock();
                                textClassifierLibImpl.g.writeLock().unlock();
                                return eulb.a;
                            } catch (Throwable th) {
                                textClassifierLibImpl.h.readLock().unlock();
                                textClassifierLibImpl.g.writeLock().unlock();
                                throw th;
                            }
                        }
                    }, eoscVar)), new ejvr() { // from class: euky
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ekgb ekgbVar = TextClassifierLibImpl.a;
                            return eulb.a;
                        }
                    }, eoscVar);
                } catch (UnsatisfiedLinkError e2) {
                    ListenableFuture listenableFutureH = eork.h(e2);
                    this.x.writeLock().unlock();
                    return listenableFutureH;
                }
            } catch (Throwable th) {
                this.x.writeLock().unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4 A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1 A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d1 A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d9 A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6 A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f6 A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:8:0x0044, B:10:0x0048, B:12:0x0084, B:14:0x0088, B:19:0x00a7, B:21:0x00ca, B:115:0x02e6, B:117:0x0336, B:118:0x034c, B:120:0x0354, B:121:0x0360, B:125:0x0374, B:165:0x0428, B:167:0x042e, B:168:0x0439, B:128:0x0381, B:129:0x038c, B:131:0x0392, B:133:0x039a, B:138:0x03aa, B:139:0x03ae, B:163:0x03fa, B:164:0x03fd, B:143:0x03bc, B:146:0x03c5, B:149:0x03d1, B:151:0x03d4, B:155:0x03dc, B:157:0x03df, B:160:0x03e8, B:161:0x03eb, B:172:0x0457, B:173:0x0460, B:22:0x00d5, B:24:0x00db, B:25:0x00f5, B:27:0x00f8, B:29:0x0104, B:31:0x0108, B:108:0x02c1, B:109:0x02c5, B:111:0x02cb, B:113:0x02d9, B:33:0x0110, B:34:0x011e, B:36:0x012d, B:38:0x013a, B:86:0x021c, B:41:0x0151, B:43:0x0155, B:44:0x0157, B:46:0x015d, B:47:0x015f, B:49:0x016a, B:51:0x016e, B:52:0x0170, B:57:0x017e, B:59:0x018e, B:60:0x0190, B:62:0x019b, B:64:0x01a3, B:66:0x01b4, B:67:0x01b9, B:69:0x01c1, B:71:0x01c9, B:75:0x01de, B:77:0x01e6, B:78:0x01eb, B:80:0x01ef, B:81:0x01f2, B:83:0x01f6, B:85:0x0202, B:72:0x01d1, B:74:0x01d9, B:100:0x02a4, B:88:0x022a, B:89:0x0233, B:91:0x0239, B:93:0x0247, B:95:0x025f, B:96:0x0264, B:98:0x027b, B:99:0x0288, B:102:0x02aa, B:103:0x02b1, B:104:0x02b2, B:106:0x02b8, B:107:0x02bd, B:122:0x036e, B:124:0x0372, B:127:0x037d), top: B:188:0x0044, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eukb i(defpackage.eujw r31) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl.i(eujw):eukb");
    }

    public final eulj j(euli euliVar) {
        if (r) {
            Log.d("TextClassifierLibImpl", "detectLanguage in PID " + Process.myPid());
        }
        euliVar.getClass();
        try {
            ((eooi) this.c).q();
            o();
            String string = euliVar.a().toString();
            euhd euhdVar = new euhd();
            ReadWriteLock readWriteLock = this.h;
            readWriteLock.readLock().lock();
            try {
                LangIdModel langIdModel = this.n;
                if (langIdModel != null) {
                    for (LangIdModel.LanguageResult languageResult : langIdModel.nativeDetectLanguages(langIdModel.a, string)) {
                        Locale locale = new Locale(languageResult.a);
                        float f = languageResult.b;
                        if (euhdVar.a == null) {
                            int i = ekgb.d;
                            euhdVar.a = new ekfw();
                        }
                        euhdVar.a.h(new euhf(locale, f));
                    }
                }
                eulj euljVarA = euhdVar.a();
                readWriteLock.readLock().unlock();
                return euljVarA;
            } catch (Throwable th) {
                this.h.readLock().unlock();
                throw th;
            }
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (!((euhb) this.d).a) {
                throw new IllegalStateException("Failed to initialize.", e);
            }
            Log.w("TextClassifierLibImpl", "Failed to initialize, using the fallback.");
            return new euhd().a();
        }
    }

    public final void k() {
        this.i.writeLock().lock();
        try {
            ActionsSuggestionsModel actionsSuggestionsModel = this.p;
            if (actionsSuggestionsModel != null) {
                actionsSuggestionsModel.close();
                this.p = null;
                this.q = null;
            }
        } finally {
            this.i.writeLock().unlock();
        }
    }

    public final void l() {
        this.g.writeLock().lock();
        try {
            AnnotatorModel annotatorModel = this.j;
            if (annotatorModel != null) {
                annotatorModel.close();
                this.j = null;
                this.l = null;
            }
        } finally {
            this.g.writeLock().unlock();
        }
    }
}
