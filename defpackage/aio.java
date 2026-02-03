package defpackage;

import android.app.appsearch.AppSearchResult;
import android.app.appsearch.AppSearchSchema;
import android.app.appsearch.AppSearchSession;
import android.app.appsearch.GetSchemaResponse;
import android.app.appsearch.PackageIdentifier;
import android.app.appsearch.PutDocumentsRequest;
import android.app.appsearch.RemoveByDocumentIdRequest;
import android.app.appsearch.SetSchemaRequest;
import android.app.appsearch.SetSchemaResponse;
import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aio implements afp {
    public final AppSearchSession a;
    public final Executor b;
    public final Context c;
    private final aia d;

    public aio(AppSearchSession appSearchSession, Executor executor, Context context) {
        lcg.i(appSearchSession);
        this.a = appSearchSession;
        this.b = executor;
        this.c = context;
        this.d = new aia(context);
    }

    @Override // defpackage.afp
    public final ags a(String str, agu aguVar) {
        AppSearchSession appSearchSession = this.a;
        Context context = this.c;
        return new aig(appSearchSession.search(str, ajf.a(context, aguVar)), aguVar, this.b, context);
    }

    @Override // defpackage.afp
    public final ListenableFuture b() {
        final kop kopVar = new kop();
        this.a.getSchema(this.b, new Consumer() { // from class: aij
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                aip.b(aib$$ExternalSyntheticApiModelOutline0.m84m(obj), kopVar, new Function() { // from class: aik
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        afl aflVarB;
                        GetSchemaResponse getSchemaResponseM91m = aib$$ExternalSyntheticApiModelOutline0.m91m(obj2);
                        lcg.i(getSchemaResponseM91m);
                        afw afwVar = new afw();
                        if (Build.VERSION.SDK_INT < 33) {
                            afwVar.c(false);
                        }
                        Iterator it = getSchemaResponseM91m.getSchemas().iterator();
                        while (it.hasNext()) {
                            AppSearchSchema appSearchSchemaM89m = aib$$ExternalSyntheticApiModelOutline0.m89m(it.next());
                            lcg.i(appSearchSchemaM89m);
                            afb afbVar = new afb(appSearchSchemaM89m.getSchemaType());
                            List properties = appSearchSchemaM89m.getProperties();
                            if (Build.VERSION.SDK_INT >= 35) {
                                List<String> listB = aix.b(appSearchSchemaM89m);
                                for (int i = 0; i < listB.size(); i++) {
                                    String str = listB.get(i);
                                    lcg.i(str);
                                    afbVar.b();
                                    afbVar.a.add(str);
                                }
                            }
                            for (int i2 = 0; i2 < properties.size(); i2++) {
                                AppSearchSchema.PropertyConfig propertyConfigM87m = aib$$ExternalSyntheticApiModelOutline0.m87m(properties.get(i2));
                                lcg.i(propertyConfigM87m);
                                if (aib$$ExternalSyntheticApiModelOutline0.m$1(propertyConfigM87m)) {
                                    AppSearchSchema.StringPropertyConfig stringPropertyConfigM88m = aib$$ExternalSyntheticApiModelOutline0.m88m((Object) propertyConfigM87m);
                                    afm afmVar = new afm(stringPropertyConfigM88m.getName());
                                    afmVar.b(stringPropertyConfigM88m.getCardinality());
                                    afmVar.c(stringPropertyConfigM88m.getIndexingType());
                                    afmVar.e(stringPropertyConfigM88m.getTokenizerType());
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        afmVar.d(aiw.b(stringPropertyConfigM88m));
                                    }
                                    aflVarB = afmVar.a();
                                } else if (aib$$ExternalSyntheticApiModelOutline0.m$2(propertyConfigM87m)) {
                                    AppSearchSchema.LongPropertyConfig longPropertyConfigM86m = aib$$ExternalSyntheticApiModelOutline0.m86m((Object) propertyConfigM87m);
                                    afj afjVar = new afj(longPropertyConfigM86m.getName());
                                    afjVar.b(longPropertyConfigM86m.getCardinality());
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        afjVar.c(aiw.a(longPropertyConfigM86m));
                                    }
                                    aflVarB = afjVar.a();
                                } else if (aib$$ExternalSyntheticApiModelOutline0.m$3(propertyConfigM87m)) {
                                    afg afgVar = new afg(propertyConfigM87m.getName());
                                    afgVar.b(propertyConfigM87m.getCardinality());
                                    aflVarB = afgVar.a();
                                } else if (aib$$ExternalSyntheticApiModelOutline0.m108m((Object) propertyConfigM87m)) {
                                    aez aezVar = new aez(propertyConfigM87m.getName());
                                    aezVar.b(propertyConfigM87m.getCardinality());
                                    aflVarB = aezVar.a();
                                } else if (aib$$ExternalSyntheticApiModelOutline0.m$4(propertyConfigM87m)) {
                                    afc afcVar = new afc(propertyConfigM87m.getName());
                                    afcVar.b(propertyConfigM87m.getCardinality());
                                    aflVarB = afcVar.a();
                                } else if (aib$$ExternalSyntheticApiModelOutline0.m$5(propertyConfigM87m)) {
                                    AppSearchSchema.DocumentPropertyConfig documentPropertyConfigM85m = aib$$ExternalSyntheticApiModelOutline0.m85m((Object) propertyConfigM87m);
                                    afe afeVar = new afe(documentPropertyConfigM85m.getName(), documentPropertyConfigM85m.getSchemaType());
                                    afeVar.b(documentPropertyConfigM85m.getCardinality());
                                    afeVar.a = documentPropertyConfigM85m.shouldIndexNestedProperties();
                                    if (Build.VERSION.SDK_INT >= 35) {
                                        List<String> listA = aix.a(documentPropertyConfigM85m);
                                        lcg.i(listA);
                                        afeVar.b.addAll(listA);
                                    }
                                    aflVarB = afeVar.a();
                                } else {
                                    if (!ajk.b() || !aao$$ExternalSyntheticApiModelOutline4.m19m((Object) propertyConfigM87m)) {
                                        throw new IllegalArgumentException("Invalid property type " + propertyConfigM87m.getClass() + ": " + propertyConfigM87m);
                                    }
                                    aflVarB = aiv.b(aao$$ExternalSyntheticApiModelOutline4.m((Object) propertyConfigM87m));
                                }
                                afbVar.c(aflVarB);
                            }
                            afo afoVarA = afbVar.a();
                            afwVar.b();
                            afwVar.a.add(afoVarA);
                        }
                        lcg.b(getSchemaResponseM91m.getVersion() >= 0, "Version must be a non-negative number.");
                        afwVar.b();
                        if (Build.VERSION.SDK_INT >= 33) {
                            for (String str2 : ais.c(getSchemaResponseM91m)) {
                                lcg.i(str2);
                                afwVar.b();
                                afy afyVarA = afwVar.a(str2);
                                afyVarA.a();
                                afyVarA.b = true;
                            }
                            Map<String, Set<PackageIdentifier>> mapB = ais.b(getSchemaResponseM91m);
                            if (mapB != null) {
                                for (Map.Entry<String, Set<PackageIdentifier>> entry : mapB.entrySet()) {
                                    css cssVar = new css(entry.getValue().size());
                                    Iterator<PackageIdentifier> it2 = entry.getValue().iterator();
                                    while (it2.hasNext()) {
                                        PackageIdentifier packageIdentifierM92m = aib$$ExternalSyntheticApiModelOutline0.m92m((Object) it2.next());
                                        cssVar.add(new agd(packageIdentifierM92m.getPackageName(), packageIdentifierM92m.getSha256Certificate()));
                                    }
                                    String key = entry.getKey();
                                    lcg.i(key);
                                    afwVar.b();
                                    afy afyVarA2 = afwVar.a(key);
                                    csr csrVar = new csr(cssVar);
                                    while (csrVar.hasNext()) {
                                        agd agdVar = (agd) csrVar.next();
                                        afyVarA2.a();
                                        afyVarA2.c.b(agdVar);
                                    }
                                }
                            }
                            for (Map.Entry<String, Set<Set<Integer>>> entry2 : ais.a(getSchemaResponseM91m).entrySet()) {
                                String key2 = entry2.getKey();
                                Set<Set<Integer>> value = entry2.getValue();
                                lcg.i(key2);
                                lcg.i(value);
                                afwVar.b();
                                afy afyVarA3 = afwVar.a(key2);
                                for (Set<Integer> set : value) {
                                    afyVarA3.a();
                                    afyVarA3.c.c(set);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 35) {
                            Map<String, agd> mapA = ait.a(getSchemaResponseM91m);
                            if (!mapA.isEmpty()) {
                                for (Map.Entry<String, agd> entry3 : mapA.entrySet()) {
                                    String key3 = entry3.getKey();
                                    agd value2 = entry3.getValue();
                                    lcg.i(key3);
                                    lcg.i(value2);
                                    afwVar.b();
                                    afy afyVarA4 = afwVar.a(key3);
                                    afyVarA4.a();
                                    afyVarA4.c.d(value2);
                                }
                            }
                            Map<String, Set<agl>> mapB2 = ait.b(getSchemaResponseM91m);
                            if (!mapB2.isEmpty()) {
                                for (Map.Entry<String, Set<agl>> entry4 : mapB2.entrySet()) {
                                    String key4 = entry4.getKey();
                                    Set<agl> value3 = entry4.getValue();
                                    lcg.i(key4);
                                    lcg.i(value3);
                                    afwVar.b();
                                    afy afyVarA5 = afwVar.a(key4);
                                    for (agl aglVar : value3) {
                                        aglVar.getClass();
                                        afyVarA5.a();
                                        afyVarA5.d.add(aglVar);
                                    }
                                }
                            }
                        }
                        if (afwVar.b != null) {
                            ArrayList arrayList = new ArrayList();
                            for (afy afyVar : afwVar.b.values()) {
                                afyVar.e = true;
                                arrayList.add(new afz(afyVar.a, afyVar.b, afyVar.c.a(), afyVar.d));
                            }
                        }
                        afwVar.c = true;
                        return new afx(afwVar.a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return kopVar;
    }

    @Override // defpackage.afp
    public final ListenableFuture c(agh aghVar) {
        lcg.i(aghVar);
        kop kopVar = new kop();
        lcg.i(aghVar);
        PutDocumentsRequest.Builder builder = new PutDocumentsRequest.Builder();
        Iterator it = aghVar.a().iterator();
        while (it.hasNext()) {
            builder.addGenericDocuments(air.a((afv) it.next()));
        }
        for (afv afvVar : aghVar.b()) {
            if (Build.VERSION.SDK_INT >= 35) {
                aiu.a(builder, air.a(afvVar));
            } else {
                builder.addGenericDocuments(air.a(afvVar));
            }
        }
        this.a.put(builder.build(), this.b, ajl.a(kopVar));
        return kopVar;
    }

    @Override // defpackage.afp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.afp
    public final ListenableFuture d(agj agjVar) {
        kop kopVar = new kop();
        RemoveByDocumentIdRequest.Builder builder = new RemoveByDocumentIdRequest.Builder(agjVar.a);
        if (agjVar.c == null) {
            agjVar.c = DesugarCollections.unmodifiableSet(new css(agjVar.b));
        }
        this.a.remove(builder.addIds((Collection<String>) agjVar.c).build(), this.b, ajl.a(kopVar));
        return kopVar;
    }

    @Override // defpackage.afp
    public final ListenableFuture e(agw agwVar) {
        Iterator it;
        AppSearchSchema.PropertyConfig propertyConfigA;
        final kop kopVar = new kop();
        long jA = ajk.a(this.c);
        int i = 33;
        if (jA >= 340800000 && jA < 341113000) {
            try {
                Set<afo> setF = agwVar.f();
                aia aiaVar = this.d;
                int i2 = 64;
                if (Build.VERSION.SDK_INT < 34 && (Build.VERSION.SDK_INT != 33 || ajk.a(aiaVar.a) < 340800000)) {
                    i2 = 16;
                }
                csq csqVar = new csq();
                for (afo afoVar : setF) {
                    csqVar.put(afoVar.a, afoVar);
                }
                csq csqVar2 = new csq();
                Iterator it2 = setF.iterator();
                while (it2.hasNext()) {
                    if (ajm.a((afo) it2.next(), csqVar, csqVar2, new css()) > i2) {
                        throw new ahz(a.g(i2, "Too many properties to be indexed, max number of properties allowed: "));
                    }
                }
            } catch (ahz e) {
                kopVar.h(new ahy(3, e.getMessage()));
                return kopVar;
            }
        }
        AppSearchSession appSearchSession = this.a;
        SetSchemaRequest.Builder builder = new SetSchemaRequest.Builder();
        Iterator it3 = agwVar.f().iterator();
        while (it3.hasNext()) {
            afo afoVar2 = (afo) it3.next();
            AppSearchSchema[] appSearchSchemaArr = new AppSearchSchema[1];
            lcg.i(afoVar2);
            AppSearchSchema.Builder builder2 = new AppSearchSchema.Builder(afoVar2.a);
            if (!afoVar2.c.isEmpty()) {
                throw new UnsupportedOperationException("SCHEMA_SET_DESCRIPTION is not available on this AppSearch implementation.");
            }
            if (!afoVar2.a().isEmpty()) {
                if (Build.VERSION.SDK_INT < 35) {
                    throw new UnsupportedOperationException("SCHEMA_ADD_PARENT_TYPE is not available on this AppSearch implementation.");
                }
                List listA = afoVar2.a();
                for (int i3 = 0; i3 < listA.size(); i3++) {
                    aix.d(builder2, (String) listA.get(i3));
                }
            }
            List listB = afoVar2.b();
            int i4 = 0;
            while (i4 < listB.size()) {
                afl aflVar = (afl) listB.get(i4);
                lcg.i(aflVar);
                if (!aflVar.f().isEmpty()) {
                    throw new UnsupportedOperationException("SCHEMA_SET_DESCRIPTION is not available on this AppSearch implementation.");
                }
                if (aflVar instanceof afn) {
                    afn afnVar = (afn) aflVar;
                    AppSearchSchema.StringPropertyConfig.Builder tokenizerType = new AppSearchSchema.StringPropertyConfig.Builder(afnVar.g()).setCardinality(afnVar.d()).setIndexingType(afnVar.a()).setTokenizerType(afnVar.c());
                    if (Build.VERSION.SDK_INT == i) {
                        it = it3;
                        lcg.f(afnVar.c(), 0, 1, "tokenizerType");
                    } else {
                        it = it3;
                    }
                    if (afnVar.b() == 1) {
                        if (Build.VERSION.SDK_INT < 34) {
                            throw new UnsupportedOperationException("StringPropertyConfig.JOINABLE_VALUE_TYPE_QUALIFIED_ID is not supported on this AppSearch implementation.");
                        }
                        aiw.d(tokenizerType, afnVar.b());
                    }
                    propertyConfigA = tokenizerType.build();
                } else {
                    it = it3;
                    if (aflVar instanceof afk) {
                        afk afkVar = (afk) aflVar;
                        AppSearchSchema.LongPropertyConfig.Builder cardinality = new AppSearchSchema.LongPropertyConfig.Builder(aflVar.g()).setCardinality(aflVar.d());
                        if (afkVar.a() == 1) {
                            if (Build.VERSION.SDK_INT < 34) {
                                throw new UnsupportedOperationException("LongProperty.INDEXING_TYPE_RANGE is not supported on this AppSearch implementation.");
                            }
                            aiw.c(cardinality, afkVar.a());
                        }
                        ajy ajyVar = afkVar.a;
                        propertyConfigA = cardinality.build();
                    } else if (aflVar instanceof afh) {
                        ajy ajyVar2 = ((afh) aflVar).a;
                        propertyConfigA = new AppSearchSchema.DoublePropertyConfig.Builder(aflVar.g()).setCardinality(aflVar.d()).build();
                    } else if (aflVar instanceof afa) {
                        ajy ajyVar3 = ((afa) aflVar).a;
                        propertyConfigA = new AppSearchSchema.BooleanPropertyConfig.Builder(aflVar.g()).setCardinality(aflVar.d()).build();
                    } else if (aflVar instanceof afd) {
                        propertyConfigA = new AppSearchSchema.BytesPropertyConfig.Builder(aflVar.g()).setCardinality(aflVar.d()).build();
                    } else if (aflVar instanceof aff) {
                        aff affVar = (aff) aflVar;
                        AppSearchSchema.DocumentPropertyConfig.Builder shouldIndexNestedProperties = new AppSearchSchema.DocumentPropertyConfig.Builder(affVar.g(), affVar.a()).setCardinality(affVar.d()).setShouldIndexNestedProperties(affVar.c());
                        if (!affVar.b().isEmpty()) {
                            if (Build.VERSION.SDK_INT < 35) {
                                throw new UnsupportedOperationException("DocumentPropertyConfig.addIndexableNestedProperties is not supported on this AppSearch implementation.");
                            }
                            aix.c(shouldIndexNestedProperties, affVar.b());
                        }
                        propertyConfigA = shouldIndexNestedProperties.build();
                    } else {
                        if (!(aflVar instanceof afi)) {
                            if (aflVar instanceof aey) {
                                throw new UnsupportedOperationException("BLOB_STORAGE is not available on this AppSearch implementation.");
                            }
                            throw new IllegalArgumentException("Invalid dataType: " + aflVar.e());
                        }
                        if (!ajk.b()) {
                            throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
                        }
                        afi afiVar = (afi) aflVar;
                        ajy ajyVar4 = afiVar.a;
                        propertyConfigA = aiv.a(afiVar);
                    }
                }
                builder2.addProperty(propertyConfigA);
                i4++;
                it3 = it;
                i = 33;
            }
            appSearchSchemaArr[0] = builder2.build();
            builder.addSchemas(appSearchSchemaArr);
            it3 = it3;
            i = 33;
        }
        Iterator it4 = agwVar.g().iterator();
        while (it4.hasNext()) {
            builder.setSchemaTypeDisplayedBySystem((String) it4.next(), false);
        }
        for (Map.Entry entry : agwVar.c.entrySet()) {
            for (agd agdVar : (Set) entry.getValue()) {
                builder.setSchemaTypeVisibilityForPackage((String) entry.getKey(), true, new PackageIdentifier(agdVar.a(), agdVar.b()));
            }
        }
        if (!agwVar.c().isEmpty()) {
            if (Build.VERSION.SDK_INT < 33) {
                throw new UnsupportedOperationException("Set required permissions for schema type visibility are not supported with this backend/Android API level combination.");
            }
            for (Map.Entry entry2 : agwVar.c().entrySet()) {
                Iterator it5 = ((Set) entry2.getValue()).iterator();
                while (it5.hasNext()) {
                    ajh.a(builder, (String) entry2.getKey(), (Set) it5.next());
                }
            }
        }
        if (!agwVar.b().isEmpty()) {
            if (Build.VERSION.SDK_INT < 35) {
                throw new UnsupportedOperationException("Publicly visible schema are not supported on this AppSearch implementation.");
            }
            for (Map.Entry entry3 : agwVar.b().entrySet()) {
                agd agdVar2 = (agd) entry3.getValue();
                aji.b(builder, (String) entry3.getKey(), new PackageIdentifier(agdVar2.a(), agdVar2.b()));
            }
        }
        if (!agwVar.d().isEmpty()) {
            if (Build.VERSION.SDK_INT < 35) {
                throw new UnsupportedOperationException("Schema visible to config are not supported on this AppSearch implementation.");
            }
            for (Map.Entry entry4 : agwVar.d().entrySet()) {
                aji.a(builder, (String) entry4.getKey(), (Set) entry4.getValue());
            }
        }
        for (Map.Entry entry5 : DesugarCollections.unmodifiableMap(agwVar.g).entrySet()) {
            builder.setMigrator((String) entry5.getKey(), new ajg((agc) entry5.getValue()));
        }
        SetSchemaRequest setSchemaRequestBuild = builder.setForceOverride(agwVar.h).setVersion(agwVar.i).build();
        Executor executor = this.b;
        appSearchSession.setSchema(setSchemaRequestBuild, executor, executor, new Consumer() { // from class: ain
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                aip.b(aib$$ExternalSyntheticApiModelOutline0.m84m(obj), kopVar, new Function() { // from class: aih
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        aew aewVarA;
                        SetSchemaResponse setSchemaResponseM95m = aib$$ExternalSyntheticApiModelOutline0.m95m(obj2);
                        lcg.i(setSchemaResponseM95m);
                        agx agxVar = new agx();
                        Set deletedTypes = setSchemaResponseM95m.getDeletedTypes();
                        lcg.i(deletedTypes);
                        agxVar.a();
                        agxVar.b.addAll(deletedTypes);
                        Set incompatibleTypes = setSchemaResponseM95m.getIncompatibleTypes();
                        lcg.i(incompatibleTypes);
                        agxVar.a();
                        agxVar.d.addAll(incompatibleTypes);
                        Set migratedTypes = setSchemaResponseM95m.getMigratedTypes();
                        lcg.i(migratedTypes);
                        agxVar.a();
                        agxVar.c.addAll(migratedTypes);
                        Iterator it6 = setSchemaResponseM95m.getMigrationFailures().iterator();
                        while (it6.hasNext()) {
                            SetSchemaResponse.MigrationFailure migrationFailureM94m = aib$$ExternalSyntheticApiModelOutline0.m94m(it6.next());
                            String namespace = migrationFailureM94m.getNamespace();
                            String documentId = migrationFailureM94m.getDocumentId();
                            String schemaType = migrationFailureM94m.getSchemaType();
                            AppSearchResult appSearchResult = migrationFailureM94m.getAppSearchResult();
                            Function functionIdentity = Function$CC.identity();
                            lcg.i(appSearchResult);
                            if (appSearchResult.isSuccess()) {
                                try {
                                    aewVarA = new aew(0, functionIdentity.apply(appSearchResult.getResultValue()), null);
                                } catch (Throwable th) {
                                    aewVarA = aew.a(th);
                                }
                            } else {
                                aewVarA = new aew(appSearchResult.getResultCode(), null, appSearchResult.getErrorMessage());
                            }
                            agy agyVar = new agy(namespace, documentId, schemaType, aewVarA);
                            agxVar.a();
                            agxVar.a.add(agyVar);
                        }
                        agxVar.e = true;
                        return new agz(agxVar.d, agxVar.c, agxVar.a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return kopVar;
    }

    @Override // defpackage.afp
    public final aia f() {
        return this.d;
    }

    @Override // defpackage.afp
    public final ListenableFuture g(final agu aguVar) {
        final kop kopVar = new kop();
        if (Build.VERSION.SDK_INT >= 33 || aguVar.a().isEmpty()) {
            this.a.remove("", ajf.a(this.c, aguVar), this.b, new Consumer() { // from class: aim
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    aip.a(aib$$ExternalSyntheticApiModelOutline0.m84m(obj), kopVar);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return kopVar;
        }
        this.a.getNamespaces(this.b, new Consumer() { // from class: ail
            public final /* synthetic */ String d = "";

            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                AppSearchResult appSearchResultM84m = aib$$ExternalSyntheticApiModelOutline0.m84m(obj);
                boolean zIsSuccess = appSearchResultM84m.isSuccess();
                aio aioVar = this.a;
                final kop kopVar2 = kopVar;
                agu aguVar2 = aguVar;
                String str = this.d;
                if (!zIsSuccess) {
                    kopVar2.h(new ahy(appSearchResultM84m.getResultCode(), appSearchResultM84m.getErrorMessage()));
                    return;
                }
                try {
                    Set set = (Set) appSearchResultM84m.getResultValue();
                    List listA = aguVar2.a();
                    for (int i = 0; i < listA.size(); i++) {
                        if (set.contains(listA.get(i))) {
                            aioVar.a.remove(str, ajf.a(aioVar.c, aguVar2), aioVar.b, new Consumer() { // from class: aii
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    aip.a(aib$$ExternalSyntheticApiModelOutline0.m84m(obj2), kopVar2);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return;
                        }
                    }
                    kopVar2.g(null);
                } catch (Throwable th) {
                    kopVar2.h(th);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return kopVar;
    }
}
