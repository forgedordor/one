package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eayh {
    public static final ekrg a = ekrg.c("com/google/android/libraries/privatetelemetry/mobalt/db/DataService");
    public static final Duration b = Duration.ofDays(2);
    public final ecmd c;

    public eayh(ecmd ecmdVar) {
        this.c = ecmdVar;
    }

    public static final ekgb d(ecoa ecoaVar, int i, ecnv ecnvVar) throws InterruptedException {
        eaxl eaxlVar;
        HashMap map = new HashMap();
        Cursor cursorD = ecoaVar.d(ecnvVar);
        while (cursorD.moveToNext()) {
            try {
                OptionalInt optionalIntEmpty = OptionalInt.empty();
                OptionalInt optionalIntEmpty2 = OptionalInt.empty();
                Optional optionalEmpty = Optional.empty();
                String string = cursorD.getString(cursorD.getColumnIndexOrThrow("event_vector"));
                if (string.isEmpty()) {
                    int i2 = ekgb.d;
                    eaxlVar = new eaxl(ekoe.a);
                } else {
                    Stream map2 = DesugarArrays.stream(string.split(",")).map(new Function() { // from class: eayq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(Integer.parseInt((String) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i3 = ekgb.d;
                    eaxlVar = new eaxl((ekgb) map2.collect(ekcv.a));
                }
                long j = cursorD.getLong(cursorD.getColumnIndexOrThrow("system_profile_hash"));
                ejsu ejsuVar = (ejsu) evsn.parseFrom(ejsu.a, cursorD.getBlob(cursorD.getColumnIndexOrThrow("system_profile")), evrr.a());
                if (ejsuVar == null) {
                    throw new NullPointerException("Null systemProfile");
                }
                int columnIndex = cursorD.getColumnIndex("min_day_index");
                if (columnIndex != -1 && (optionalIntEmpty = OptionalInt.of(cursorD.getInt(columnIndex))) == null) {
                    throw new NullPointerException("Null minDayIndex");
                }
                OptionalInt optionalInt = optionalIntEmpty;
                int columnIndex2 = cursorD.getColumnIndex("max_day_index");
                if (columnIndex2 != -1 && (optionalIntEmpty2 = OptionalInt.of(cursorD.getInt(columnIndex2))) == null) {
                    throw new NullPointerException("Null maxDayIndex");
                }
                OptionalInt optionalInt2 = optionalIntEmpty2;
                int columnIndex3 = cursorD.getColumnIndex("aggregate_value");
                if (columnIndex3 != -1) {
                    optionalEmpty = Optional.of((ebaw) evsn.parseFrom(ebaw.a, cursorD.getBlob(columnIndex3), evrr.a()));
                }
                eaxi eaxiVar = new eaxi(eaxlVar, j, ejsuVar, optionalInt, optionalInt2, optionalEmpty);
                eayr eayrVar = eaxiVar.a;
                List list = (List) map.get(eayrVar);
                if (list == null) {
                    map.put(eayrVar, ekjz.c(eaxiVar));
                } else {
                    int i4 = i - 2;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i == 1) {
                                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                                }
                                throw new IllegalStateException(a.g(i4, "Unexpected value for system_profile_selection: "));
                            }
                            list.add(eaxiVar);
                        } else if (((eaxg) list.get(0)).f().orElseThrow() > eaxiVar.b.orElseThrow()) {
                            map.put(eayrVar, ekjz.c(eaxiVar));
                        }
                    } else if (((eaxg) list.get(0)).e().orElseThrow() < eaxiVar.c.orElseThrow()) {
                        map.put(eayrVar, ekjz.c(eaxiVar));
                    }
                }
            } finally {
            }
        }
        if (cursorD != null) {
            cursorD.close();
        }
        Stream streamFlatMap = Collection.EL.stream(map.values()).flatMap(new Function() { // from class: eaxs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Collection.EL.stream((List) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i5 = ekgb.d;
        Collector collector = ekcv.a;
        Iterable iterable = (Iterable) streamFlatMap.collect(collector);
        ejvr ejvrVar = new ejvr() { // from class: eaxt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((eaxg) obj).a());
            }
        };
        ekgc ekgcVar = new ekgc();
        for (Object obj : iterable) {
            obj.getClass();
            ekgcVar.b(ejvrVar.apply(obj), obj);
        }
        return (ekgb) Collection.EL.stream(ekgcVar.a().map.values()).map(new Function() { // from class: eaxu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                java.util.Collection collection = (java.util.Collection) obj2;
                ejwl.b(!collection.isEmpty(), "There must be at least one AggregateData");
                final eaxg eaxgVar = (eaxg) collection.iterator().next();
                ejsu ejsuVarC = eaxgVar.c();
                Stream map3 = Collection.EL.stream(collection).peek(new Consumer() { // from class: eayk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        ejwl.b(((eaxg) obj3).a() == eaxgVar.a(), "All the AggregateData must be for the same SystemProfile.");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }).sorted(Comparator.CC.comparingInt(new ToIntFunction() { // from class: eayl
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj3) {
                        eaxg eaxgVar2 = (eaxg) obj3;
                        if (eaxgVar2.f().isPresent()) {
                            return eaxgVar2.f().orElseThrow();
                        }
                        return 0;
                    }
                })).map(new Function() { // from class: eaym
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        eaxg eaxgVar2 = (eaxg) obj3;
                        Optional.empty();
                        return new eaxk(eayr.b(((eaxl) eaxgVar2.b()).a), eaxgVar2.d());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i6 = ekgb.d;
                ekgb ekgbVar = (ekgb) map3.collect(ekcv.a);
                ejwl.b(!ekgbVar.isEmpty(), "There must be at least one event record");
                return new eaxj(ejsuVarC, ekgbVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector);
    }

    public static final int e(ecoa ecoaVar, eayy eayyVar, int i, int i2) throws InterruptedException {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("SELECT last_sent_day_index FROM Reports");
        ecnwVar.b(" WHERE ");
        ecnwVar.b("customer_id = ?");
        eaxo eaxoVar = (eaxo) eayyVar;
        ecnwVar.c(Long.valueOf(eaxoVar.a));
        ecnwVar.b(" AND project_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.b));
        ecnwVar.b(" AND metric_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.c));
        ecnwVar.b(" AND report_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.d));
        Cursor cursorD = ecoaVar.d(ecnwVar.a());
        try {
            int i3 = i + 1;
            if (!cursorD.moveToFirst()) {
                ecoaVar.c("Reports", eaza.a(eayyVar, i), 4);
            } else if (!cursorD.isNull(cursorD.getColumnIndexOrThrow("last_sent_day_index"))) {
                i3 = cursorD.getInt(cursorD.getColumnIndexOrThrow("last_sent_day_index")) + 1;
            }
            if (cursorD != null) {
                cursorD.close();
            }
            int i4 = i - 3;
            if (i3 < i4) {
                i3 = i4;
            }
            return i3 < i2 ? i2 : i3;
        } catch (Throwable th) {
            if (cursorD != null) {
                try {
                    cursorD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final void f(ecoa ecoaVar, eayy eayyVar, int i, ejsu ejsuVar, int i2, eayr eayrVar, long j, Object obj, BiFunction biFunction) throws InterruptedException {
        int i3 = elcz.a;
        long jC = elcp.a.b(ejsuVar.toByteArray()).c();
        ContentValues contentValues = new ContentValues();
        Long lValueOf = Long.valueOf(jC);
        contentValues.put("system_profile_hash", lValueOf);
        contentValues.put("system_profile", ejsuVar.toByteArray());
        ecoaVar.c("SystemProfiles", contentValues, 4);
        ecoaVar.c("Reports", eaza.a(eayyVar, i - 1), 4);
        ejwl.b(i2 == 4 || i2 == 3 || i2 == 5, "System profile selection must be one of SELECT_FIRST, SELECT_LAST, OR REPORT_ALL");
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("SELECT system_profile_hash, aggregate_value");
        ecnwVar.b(" FROM AggregateStore");
        ecnwVar.b(" WHERE customer_id = ?");
        eaxo eaxoVar = (eaxo) eayyVar;
        ecnwVar.c(Long.valueOf(eaxoVar.a));
        ecnwVar.b(" AND project_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.b));
        ecnwVar.b(" AND metric_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.c));
        ecnwVar.b(" AND report_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.d));
        ecnwVar.b(" AND day_index = ?");
        ecnwVar.c(Long.valueOf(i));
        ecnwVar.b(" AND event_vector = ?");
        ecnwVar.d(eayrVar.c());
        ecnwVar.b(" ORDER BY system_profile_hash == ? DESC");
        ecnwVar.c(lValueOf);
        ecnwVar.b(", system_profile_hash ASC");
        ecnwVar.b(" LIMIT 1");
        Cursor cursorD = ecoaVar.d(ecnwVar.a());
        try {
            if (cursorD.moveToFirst()) {
                long j2 = cursorD.getLong(cursorD.getColumnIndexOrThrow("system_profile_hash"));
                if (j2 == jC) {
                    j(ecoaVar, eayyVar, i, j2, Optional.empty(), eayrVar, j, (Optional) biFunction.apply(obj, Optional.of(g(cursorD))));
                } else {
                    int i4 = i2 - 2;
                    if (i4 == 1) {
                        j(ecoaVar, eayyVar, i, j2, Optional.of(lValueOf), eayrVar, j, (Optional) biFunction.apply(obj, Optional.of(g(cursorD))));
                    } else if (i4 == 2) {
                        j(ecoaVar, eayyVar, i, j2, Optional.empty(), eayrVar, j, (Optional) biFunction.apply(obj, Optional.of(g(cursorD))));
                    } else {
                        if (i4 != 3) {
                            throw new AssertionError(a.v(i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNRECOGNIZED" : "REPORT_ALL" : "SELECT_FIRST" : "SELECT_LAST" : "SYSTEM_PROFILE_SELECTION_POLICY_UNSET", "Unsupported system profile selection policy: "));
                        }
                        i(ecoaVar, eayyVar, i, jC, eayrVar, j, (Optional) biFunction.apply(obj, Optional.empty()));
                    }
                }
            } else {
                i(ecoaVar, eayyVar, i, jC, eayrVar, j, (Optional) biFunction.apply(obj, Optional.empty()));
            }
            if (cursorD != null) {
                cursorD.close();
            }
        } finally {
        }
    }

    private static eayg g(Cursor cursor) {
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("aggregate_value"));
        if (blob == null) {
            return eayg.b();
        }
        return new eayg(Optional.of((ebaw) evsn.parseFrom(ebaw.a, blob, evrr.a())));
    }

    private static final boolean h(ecoa ecoaVar, eayy eayyVar, int i, long j, eayr eayrVar, long j2) throws InterruptedException {
        boolean z = true;
        if (j2 == 0) {
            return true;
        }
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("SELECT COUNT(DISTINCT event_vector) AS num_event_vectors");
        ecnwVar.b(" FROM AggregateStore");
        ecnwVar.b(" WHERE customer_id = ?");
        eaxo eaxoVar = (eaxo) eayyVar;
        ecnwVar.c(Long.valueOf(eaxoVar.a));
        ecnwVar.b(" AND project_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.b));
        ecnwVar.b(" AND metric_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.c));
        ecnwVar.b(" AND report_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.d));
        ecnwVar.b(" AND day_index = ?");
        ecnwVar.c(Long.valueOf(i));
        ecnwVar.b(" AND system_profile_hash = ?");
        ecnwVar.c(Long.valueOf(j));
        Cursor cursorD = ecoaVar.d(ecnwVar.a());
        try {
            cursorD.moveToFirst();
            if (cursorD.getLong(cursorD.getColumnIndexOrThrow("num_event_vectors")) >= j2) {
                ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/privatetelemetry/mobalt/db/DataService", "canAddEventVectorToSystemProfile", 234, "DataService.java")).I("Dropping eventVector %s for report %s, due to exceeding event_vector_buffer_max %s", eayrVar, eayyVar, Long.valueOf(j2));
                z = false;
            }
            if (cursorD != null) {
                cursorD.close();
            }
            return z;
        } catch (Throwable th) {
            if (cursorD != null) {
                try {
                    cursorD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static final void i(ecoa ecoaVar, eayy eayyVar, int i, long j, eayr eayrVar, long j2, Optional optional) throws InterruptedException {
        if (!optional.isEmpty() && h(ecoaVar, eayyVar, i, j, eayrVar, j2)) {
            eayg eaygVar = (eayg) optional.get();
            if (eaygVar.d()) {
                ecoaVar.c("AggregateStore", eaxh.a(eayyVar, i, j, eayrVar, Optional.empty()), 1);
            } else {
                ecoaVar.c("AggregateStore", eaxh.a(eayyVar, i, j, eayrVar, Optional.of(eaygVar.c())), 1);
            }
        }
    }

    private static final void j(ecoa ecoaVar, eayy eayyVar, int i, long j, Optional optional, eayr eayrVar, long j2, Optional optional2) throws InterruptedException {
        if (optional.isEmpty() && optional2.isEmpty()) {
            return;
        }
        boolean z = true;
        if (!optional.isEmpty()) {
            if (((Long) optional.get()).equals(Long.valueOf(j))) {
                z = false;
            }
        }
        ejwl.b(z, "New system profile has must differ from the existing system profile");
        if (!optional.isPresent() || h(ecoaVar, eayyVar, i, ((Long) optional.get()).longValue(), eayrVar, j2)) {
            if (optional.isPresent() && optional2.isPresent()) {
                eayg eaygVar = (eayg) optional2.get();
                if (eaygVar.d()) {
                    ecoaVar.g(eaxh.b(eayyVar, i, eayrVar, j, ((Long) optional.get()).longValue()));
                    return;
                }
                Long l = (Long) optional.get();
                l.longValue();
                ebaw ebawVarC = eaygVar.c();
                ecnw ecnwVar = new ecnw();
                ecnwVar.b("UPDATE AggregateStore SET system_profile_hash = ? ");
                ecnwVar.c(l);
                ecnwVar.b(", aggregate_value = ? ");
                ecnwVar.e(ebawVarC.toByteArray());
                ecnwVar.b(" WHERE customer_id = ?");
                eaxo eaxoVar = (eaxo) eayyVar;
                ecnwVar.c(Long.valueOf(eaxoVar.a));
                ecnwVar.b(" AND project_id = ?");
                ecnwVar.c(Long.valueOf(eaxoVar.b));
                ecnwVar.b(" AND metric_id = ?");
                ecnwVar.c(Long.valueOf(eaxoVar.c));
                ecnwVar.b(" AND report_id = ?");
                ecnwVar.c(Long.valueOf(eaxoVar.d));
                ecnwVar.b(" AND day_index = ?");
                ecnwVar.c(Long.valueOf(i));
                ecnwVar.b(" AND event_vector = ?");
                ecnwVar.d(eayrVar.c());
                ecnwVar.b(" AND system_profile_hash = ?");
                ecnwVar.c(Long.valueOf(j));
                ecoaVar.g(ecnwVar.a());
                return;
            }
            if (optional.isPresent()) {
                ecoaVar.g(eaxh.b(eayyVar, i, eayrVar, j, ((Long) optional.get()).longValue()));
                return;
            }
            if (optional2.isPresent()) {
                eayg eaygVar2 = (eayg) optional2.get();
                if (eaygVar2.d()) {
                    throw new AssertionError("Empty system profile and NULL value while updating value for ".concat(eayyVar.toString()));
                }
                ebaw ebawVarC2 = eaygVar2.c();
                ecnw ecnwVar2 = new ecnw();
                ecnwVar2.b("UPDATE AggregateStore SET aggregate_value = ? ");
                ecnwVar2.e(ebawVarC2.toByteArray());
                ecnwVar2.b(" WHERE customer_id = ?");
                eaxo eaxoVar2 = (eaxo) eayyVar;
                ecnwVar2.c(Long.valueOf(eaxoVar2.a));
                ecnwVar2.b(" AND project_id = ?");
                ecnwVar2.c(Long.valueOf(eaxoVar2.b));
                ecnwVar2.b(" AND metric_id = ?");
                ecnwVar2.c(Long.valueOf(eaxoVar2.c));
                ecnwVar2.b(" AND report_id = ?");
                ecnwVar2.c(Long.valueOf(eaxoVar2.d));
                ecnwVar2.b(" AND day_index = ?");
                ecnwVar2.c(Long.valueOf(i));
                ecnwVar2.b(" AND event_vector = ?");
                ecnwVar2.d(eayrVar.c());
                ecnwVar2.b(" AND system_profile_hash = ?");
                ecnwVar2.c(Long.valueOf(j));
                ecoaVar.g(ecnwVar2.a());
            }
        }
    }

    public final eiju a(final Instant instant) {
        return eiju.g(this.c.d(new ecnz() { // from class: eaxw
            @Override // defpackage.ecnz
            public final void a(ecoa ecoaVar) throws InterruptedException {
                ekrg ekrgVar = eayh.a;
                ecoaVar.c("GlobalValues", eays.a("start_disabled_time", instant.toString()), 4);
            }
        }));
    }

    public final eiju b(final Instant instant) {
        return eiju.g(this.c.c(new ecny() { // from class: eaxp
            /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
            @Override // defpackage.ecny
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(defpackage.ecoa r11) throws java.lang.InterruptedException {
                /*
                    r10 = this;
                    ekrg r0 = defpackage.eayh.a
                    ecnw r0 = new ecnw
                    r0.<init>()
                    java.lang.String r1 = "SELECT key_id, value"
                    r0.b(r1)
                    java.lang.String r1 = " FROM GlobalValues"
                    r0.b(r1)
                    java.lang.String r1 = " WHERE key_id IN (?, ?)"
                    r0.b(r1)
                    java.lang.String r1 = "initial_enabled_time"
                    r0.d(r1)
                    java.lang.String r2 = "start_disabled_time"
                    r0.d(r2)
                    ecnv r0 = r0.a()
                    android.database.Cursor r0 = r11.d(r0)
                    r3 = 0
                    r4 = r3
                    r5 = r4
                L2b:
                    boolean r6 = r0.moveToNext()     // Catch: java.lang.Throwable -> Lc0
                    if (r6 == 0) goto L7d
                    java.lang.String r6 = "key_id"
                    int r6 = r0.getColumnIndexOrThrow(r6)     // Catch: java.lang.Throwable -> Lc0
                    java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> Lc0
                    int r7 = r6.hashCode()     // Catch: java.lang.Throwable -> Lc0
                    r8 = -1579654618(0xffffffffa1d86226, float:-1.4662709E-18)
                    r9 = 1
                    if (r7 == r8) goto L53
                    r8 = -345489005(0xffffffffeb684193, float:-2.8078046E26)
                    if (r7 == r8) goto L4b
                    goto L5b
                L4b:
                    boolean r6 = r6.equals(r2)
                    if (r6 == 0) goto L5b
                    r6 = r9
                    goto L5c
                L53:
                    boolean r6 = r6.equals(r1)
                    if (r6 == 0) goto L5b
                    r6 = 0
                    goto L5c
                L5b:
                    r6 = -1
                L5c:
                    java.lang.String r7 = "value"
                    if (r6 == 0) goto L70
                    if (r6 == r9) goto L63
                    goto L2b
                L63:
                    int r4 = r0.getColumnIndexOrThrow(r7)     // Catch: java.lang.Throwable -> Lc0
                    java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Throwable -> Lc0
                    j$.time.Instant r4 = j$.time.Instant.parse(r4)     // Catch: java.lang.Throwable -> Lc0
                    goto L2b
                L70:
                    int r5 = r0.getColumnIndexOrThrow(r7)     // Catch: java.lang.Throwable -> Lc0
                    java.lang.String r5 = r0.getString(r5)     // Catch: java.lang.Throwable -> Lc0
                    j$.time.Instant r5 = j$.time.Instant.parse(r5)     // Catch: java.lang.Throwable -> Lc0
                    goto L2b
                L7d:
                    if (r0 == 0) goto L82
                    r0.close()
                L82:
                    j$.time.Instant r0 = r1
                    java.lang.String r6 = "GlobalValues"
                    if (r4 == 0) goto Lb0
                    j$.time.Duration r4 = j$.time.Duration.between(r4, r0)
                    j$.time.Duration r7 = defpackage.eayh.b
                    int r4 = r4.compareTo(r7)
                    if (r4 <= 0) goto L95
                    goto L96
                L95:
                    r3 = r5
                L96:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.lang.String r7 = "key_id = ?"
                    r4.append(r7)
                    r5.add(r2)
                    ecnt r2 = defpackage.ecnu.a(r6, r4, r5)
                    r11.a(r2)
                    r5 = r3
                Lb0:
                    if (r5 != 0) goto Lbf
                    java.lang.String r2 = r0.toString()
                    android.content.ContentValues r1 = defpackage.eays.a(r1, r2)
                    r2 = 5
                    r11.c(r6, r1, r2)
                    return r0
                Lbf:
                    return r5
                Lc0:
                    r11 = move-exception
                    if (r0 == 0) goto Lcb
                    r0.close()     // Catch: java.lang.Throwable -> Lc7
                    goto Lcb
                Lc7:
                    r0 = move-exception
                    r11.addSuppressed(r0)
                Lcb:
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eaxp.a(ecoa):java.lang.Object");
            }
        }));
    }

    public final eiju c() {
        return eiju.g(this.c.c(new ecny() { // from class: eayc
            @Override // defpackage.ecny
            public final Object a(ecoa ecoaVar) throws InterruptedException {
                ekrg ekrgVar = eayh.a;
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ecnw ecnwVar = new ecnw();
                ecnwVar.b("SELECT observation_store_id, observation_batch FROM ObservationStore ORDER BY observation_store_id");
                Cursor cursorD = ecoaVar.d(ecnwVar.a());
                int length = 0;
                while (cursorD.moveToNext()) {
                    try {
                        long j = cursorD.getLong(cursorD.getColumnIndexOrThrow("observation_store_id"));
                        byte[] blob = cursorD.getBlob(cursorD.getColumnIndexOrThrow("observation_batch"));
                        if (length > 0 && blob.length + length > 100000) {
                            break;
                        }
                        ekfwVar.h(new eaxn(j, (ebba) evsn.parseFrom(ebba.a, blob, evrr.a())));
                        length += blob.length;
                    } catch (Throwable th) {
                        if (cursorD != null) {
                            try {
                                cursorD.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (cursorD != null) {
                    cursorD.close();
                }
                return ekfwVar.g();
            }
        }));
    }
}
