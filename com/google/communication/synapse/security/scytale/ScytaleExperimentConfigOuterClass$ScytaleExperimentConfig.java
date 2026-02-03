package com.google.communication.synapse.security.scytale;

import defpackage.epqs;
import defpackage.evqs;
import defpackage.evqz;
import defpackage.evrr;
import defpackage.evsg;
import defpackage.evsm;
import defpackage.evsn;
import defpackage.evui;
import defpackage.evuo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig extends evsn<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig, epqs> implements evui {
    private static final ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig DEFAULT_INSTANCE;
    private static volatile evuo<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> PARSER = null;
    public static final int RUN_PER_TABLE_SCHEMA_VALIDATION_FIELD_NUMBER = 2;
    public static final int RUN_SQLITE_MASTER_SCHEMA_VALIDATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean runPerTableSchemaValidation_;
    private boolean runSqliteMasterSchemaValidation_;

    static {
        ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig = new ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig();
        DEFAULT_INSTANCE = scytaleExperimentConfigOuterClass$ScytaleExperimentConfig;
        evsn.registerDefaultInstance(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.class, scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);
    }

    private ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRunPerTableSchemaValidation() {
        this.bitField0_ &= -3;
        this.runPerTableSchemaValidation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRunSqliteMasterSchemaValidation() {
        this.bitField0_ &= -2;
        this.runSqliteMasterSchemaValidation_ = false;
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static epqs newBuilder() {
        return (epqs) DEFAULT_INSTANCE.createBuilder();
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseDelimitedFrom(InputStream inputStream) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(evqs evqsVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, evqsVar);
    }

    public static evuo<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunPerTableSchemaValidation(boolean z) {
        this.bitField0_ |= 2;
        this.runPerTableSchemaValidation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunSqliteMasterSchemaValidation(boolean z) {
        this.bitField0_ |= 1;
        this.runSqliteMasterSchemaValidation_ = z;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "runSqliteMasterSchemaValidation_", "runPerTableSchemaValidation_"});
        }
        if (iOrdinal == 3) {
            return new ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig();
        }
        if (iOrdinal == 4) {
            return new epqs();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> evuoVar = PARSER;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.class) {
            evsgVar = PARSER;
            if (evsgVar == null) {
                evsgVar = new evsg(DEFAULT_INSTANCE);
                PARSER = evsgVar;
            }
        }
        return evsgVar;
    }

    public boolean getRunPerTableSchemaValidation() {
        return this.runPerTableSchemaValidation_;
    }

    public boolean getRunSqliteMasterSchemaValidation() {
        return this.runSqliteMasterSchemaValidation_;
    }

    public boolean hasRunPerTableSchemaValidation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRunSqliteMasterSchemaValidation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static epqs newBuilder(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig) {
        return (epqs) DEFAULT_INSTANCE.createBuilder(scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseDelimitedFrom(InputStream inputStream, evrr evrrVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, evrrVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(evqs evqsVar, evrr evrrVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, evqsVar, evrrVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(evqz evqzVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, evqzVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(evqz evqzVar, evrr evrrVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, evqzVar, evrrVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(InputStream inputStream) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(InputStream inputStream, evrr evrrVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, inputStream, evrrVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(ByteBuffer byteBuffer) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(ByteBuffer byteBuffer, evrr evrrVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, byteBuffer, evrrVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(byte[] bArr) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(byte[] bArr, evrr evrrVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) evsn.parseFrom(DEFAULT_INSTANCE, bArr, evrrVar);
    }
}
