package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzco implements bzbe {
    public static final EnumSet b = EnumSet.of(bzcg.b);
    public static final EnumSet c = EnumSet.of(bzcg.a);
    public static final EnumSet d = EnumSet.of(bzcg.c);
    public static final EnumSet e = EnumSet.of(cpot.FREQUENTLY_CHANGED_PART);
    public static final EnumSet f = EnumSet.of(cpot.RARELY_CHANGED_PART);
    public static final EnumSet g = EnumSet.of(cpot.ADDITIONAL_FIELDS_PART);
    public final cpou h;
    private final cpqb i;
    private final fcyh j;
    private final aqfl k;

    public bzco(cpqb cpqbVar, cpou cpouVar, fcyh fcyhVar, aqfl aqflVar) {
        fcyhVar.getClass();
        this.i = cpqbVar;
        this.h = cpouVar;
        this.j = fcyhVar;
        this.k = aqflVar;
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ cpyi a(Object obj) {
        cppb cppbVar = (cppb) obj;
        cppbVar.getClass();
        return cppbVar.c().O();
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ Object b(Object obj, bnar bnarVar, boolean z, EnumSet enumSet, fcxy fcxyVar) {
        return g((cppb) obj, bnarVar, enumSet, fcxyVar);
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        cppb cppbVar = (cppb) obj;
        cppbVar.getClass();
        return cppbVar.c().S();
    }

    @Override // defpackage.bzbe
    public final Map e(Collection collection, EnumSet enumSet) {
        Object objA;
        collection.getClass();
        enumSet.getClass();
        if (!((eoth) ((aqeu) this.k).a.b()).a("bugle.implement_batch_fetch_local_data_for_cms_conversations")) {
            int i = bzbc.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(collection, 10)), 16));
            for (Object obj : collection) {
                try {
                    objA = c((String) obj, enumSet);
                } catch (Throwable th) {
                    objA = fctl.a(th);
                }
                linkedHashMap.put(obj, new fctk(objA));
            }
            return linkedHashMap;
        }
        final cpqb cpqbVar = this.i;
        ArrayList arrayList = new ArrayList(fcva.p(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(barn.b((String) it.next()));
        }
        final ekgb ekgbVarA = ekfv.a(arrayList);
        ekgp ekgpVar = (ekgp) cpqbVar.d.c("CmsConversationFetcher#fetchCmsConversationDataList", new ejxr() { // from class: cpps
            /* JADX WARN: Removed duplicated region for block: B:9:0x006c A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x000c, B:6:0x0014, B:8:0x0022, B:9:0x006c), top: B:18:0x000c }] */
            @Override // defpackage.ejxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    r8 = this;
                    cpqb r0 = r1
                    com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r1 = r0.a()
                    java.lang.String r2 = "CmsConversationFetcher#fetchAdditionalFields#batched"
                    eieu r2 = defpackage.eiiy.k(r2)
                    boolean r3 = defpackage.cpyl.a()     // Catch: java.lang.Throwable -> L9a
                    ekgb r4 = r2
                    if (r3 == 0) goto L6c
                    fcsu r3 = r0.b     // Catch: java.lang.Throwable -> L9a
                    java.lang.Object r5 = r3.b()     // Catch: java.lang.Throwable -> L9a
                    j$.util.Optional r5 = (j$.util.Optional) r5     // Catch: java.lang.Throwable -> L9a
                    boolean r5 = r5.isPresent()     // Catch: java.lang.Throwable -> L9a
                    if (r5 == 0) goto L6c
                    fcsu r5 = r0.c     // Catch: java.lang.Throwable -> L9a
                    java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L9a
                    cpme r5 = (defpackage.cpme) r5     // Catch: java.lang.Throwable -> L9a
                    java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L9a
                    j$.util.Optional r3 = (j$.util.Optional) r3     // Catch: java.lang.Throwable -> L9a
                    java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L9a
                    java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L9a
                    j$.util.stream.Stream r6 = j$.util.Collection.EL.stream(r4)     // Catch: java.lang.Throwable -> L9a
                    cppt r7 = new cppt     // Catch: java.lang.Throwable -> L9a
                    r7.<init>()     // Catch: java.lang.Throwable -> L9a
                    j$.util.stream.Stream r6 = r6.map(r7)     // Catch: java.lang.Throwable -> L9a
                    j$.util.stream.Collector r7 = defpackage.ekcv.a     // Catch: java.lang.Throwable -> L9a
                    java.lang.Object r6 = r6.collect(r7)     // Catch: java.lang.Throwable -> L9a
                    ekgb r6 = (defpackage.ekgb) r6     // Catch: java.lang.Throwable -> L9a
                    ekgp r3 = r5.a(r3, r6)     // Catch: java.lang.Throwable -> L9a
                    ekhx r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L9a
                    j$.util.stream.Stream r3 = j$.util.Collection.EL.stream(r3)     // Catch: java.lang.Throwable -> L9a
                    cppu r5 = new cppu     // Catch: java.lang.Throwable -> L9a
                    r5.<init>()     // Catch: java.lang.Throwable -> L9a
                    cppv r6 = new cppv     // Catch: java.lang.Throwable -> L9a
                    r6.<init>()     // Catch: java.lang.Throwable -> L9a
                    j$.util.stream.Collector r5 = defpackage.ekcv.a(r5, r6)     // Catch: java.lang.Throwable -> L9a
                    java.lang.Object r3 = r3.collect(r5)     // Catch: java.lang.Throwable -> L9a
                    ekgp r3 = (defpackage.ekgp) r3     // Catch: java.lang.Throwable -> L9a
                    goto L6e
                L6c:
                    ekgp r3 = defpackage.ekoj.a     // Catch: java.lang.Throwable -> L9a
                L6e:
                    r2.close()
                    fcsu r2 = r0.a
                    java.lang.Object r2 = r2.b()
                    bakt r2 = (defpackage.bakt) r2
                    ekgp r2 = r2.C(r4)
                    ekhx r2 = r2.entrySet()
                    j$.util.stream.Stream r2 = j$.util.Collection.EL.stream(r2)
                    cppw r4 = new cppw
                    r4.<init>()
                    cppx r5 = new cppx
                    r5.<init>()
                    j$.util.stream.Collector r0 = defpackage.ekcv.a(r4, r5)
                    java.lang.Object r0 = r2.collect(r0)
                    ekgp r0 = (defpackage.ekgp) r0
                    return r0
                L9a:
                    r0 = move-exception
                    r2.close()     // Catch: java.lang.Throwable -> L9f
                    goto La3
                L9f:
                    r1 = move-exception
                    r0.addSuppressed(r1)
                La3:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cpps.get():java.lang.Object");
            }
        });
        ekgpVar.getClass();
        ArrayList arrayList2 = new ArrayList(ekgpVar.size());
        Iterator it2 = ekgpVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            arrayList2.add(new fcti(((ConversationIdType) entry.getKey()).a(), new fctk((cppb) entry.getValue())));
        }
        Map mapK = fcwa.k(arrayList2);
        Set setE = fcwm.e(fcva.av(collection), mapK.keySet());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setE, 10)), 16));
        for (Object obj2 : setE) {
            String str = (String) obj2;
            str.getClass();
            linkedHashMap2.put(obj2, new fctk(fctl.a(new bzdd(str))));
        }
        return fcwa.j(mapK, linkedHashMap2);
    }

    @Override // defpackage.bzbe
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cppb c(final String str, EnumSet enumSet) throws X {
        str.getClass();
        enumSet.getClass();
        Object objOrElseThrow = this.i.c(barn.b(str)).orElseThrow(new Supplier() { // from class: bzcl
            @Override // java.util.function.Supplier
            public final Object get() {
                EnumSet enumSet2 = bzco.b;
                return new bzdd(str);
            }
        });
        objOrElseThrow.getClass();
        return (cppb) objOrElseThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cppb r11, defpackage.bnar r12, java.util.EnumSet r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.bzcn
            if (r0 == 0) goto L13
            r0 = r14
            bzcn r0 = (defpackage.bzcn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzcn r0 = new bzcn
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r14)
            goto L4b
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.fctl.b(r14)
            fcyh r14 = r10.j
            fcyh r14 = defpackage.eicg.a(r14)
            bzcm r4 = new bzcm
            r5 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r14 = defpackage.fdin.a(r14, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r14.getClass()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzco.g(cppb, bnar, java.util.EnumSet, fcxy):java.lang.Object");
    }
}
