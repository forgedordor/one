package defpackage;

import android.app.appsearch.AppSearchSchema;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiv {
    public static AppSearchSchema.PropertyConfig a(afi afiVar) {
        AppSearchSchema.EmbeddingPropertyConfig.Builder cardinality = new AppSearchSchema.EmbeddingPropertyConfig.Builder(afiVar.g()).setCardinality(afiVar.d());
        aju ajuVar = afiVar.a.j;
        return cardinality.setIndexingType(ajuVar == null ? 0 : ajuVar.a).build();
    }

    public static afi b(AppSearchSchema.EmbeddingPropertyConfig embeddingPropertyConfig) {
        String name = embeddingPropertyConfig.getName();
        lcg.i(name);
        int cardinality = embeddingPropertyConfig.getCardinality();
        lcg.f(cardinality, 1, 3, "cardinality");
        int indexingType = embeddingPropertyConfig.getIndexingType();
        lcg.f(indexingType, 0, 1, "indexingType");
        return new afi(new ajy(name, 7, cardinality, null, null, null, null, null, new aju(indexingType)));
    }
}
