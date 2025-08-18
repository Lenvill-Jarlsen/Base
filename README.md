# Base - Minecraft Forge 1.12.2 Mod Template

Base is a comprehensive mod template designed for creating Minecraft Forge 1.12.2 mods, specifically optimized for MineFantasy Reforged (MFR) addon development. This template provides a solid foundation with pre-configured build scripts, proper dependency management, and a well-structured codebase that follows Minecraft Forge modding best practices.

## Features

- **Minecraft Forge 1.12.2**: Built for the popular 1.12.2 modding ecosystem
- **MFR Integration**: Pre-configured for MineFantasy Reforged addon development
- **Modern Build System**: Uses Gradle with ForgeGradle, FancyGradle, and Mixin support
- **IDE Support**: Compatible with IntelliJ IDEA, Eclipse, and VS Code
- **Hot-swapping**: Mixin hot-swap support for faster development iteration
- **Comprehensive Configuration**: Centralized mod configuration through gradle.properties

## Prerequisites

Before setting up this project, ensure you have:

- **Java Development Kit (JDK) 8**: Required for Minecraft 1.12.2 development
- **Git**: For version control and cloning the repository
- An IDE of your choice (IntelliJ IDEA, Eclipse, or VS Code)

## IDE Setup

### IntelliJ IDEA (Recommended)

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd Base
   ```

2. **Prepare the workspace**:
   ```bash
   ./gradlew genIntellijRuns
   ./gradlew prepareRuns
   ```

3. **Import the project**:
   - Open IntelliJ IDEA
   - Choose "Open" and select the project root directory
   - IntelliJ will automatically detect the Gradle project

4. **Configure JDK**:
   - Go to File → Project Structure → Project Settings → Project
   - Set Project SDK to JDK 8
   - Set Project language level to 8

5. **Import Gradle project**:
   - If not automatically imported, go to View → Tool Windows → Gradle
   - Click the refresh button to sync dependencies

6. **Set up run configurations**:
   - The `genIntellijRuns` task will create run configurations automatically
   - You can find "runClient" and "runServer" configurations in the run dropdown

### Eclipse

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd Base
   ```

2. **Prepare the workspace**:
   ```bash
   ./gradlew genEclipseRuns
   ./gradlew prepareRuns
   ./gradlew eclipse
   ```

3. **Import the project**:
   - Open Eclipse
   - Go to File → Import → Existing Projects into Workspace
   - Browse to the project directory and import

4. **Configure Java Build Path**:
   - Right-click project → Properties → Java Build Path
   - Ensure JDK 8 is selected in the Libraries tab

### VS Code

1. **Install required extensions**:
   - Extension Pack for Java
   - Gradle for Java

2. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd Base
   ```

3. **Prepare the workspace**:
   ```bash
   ./gradlew genVsCodeRuns
   ./gradlew prepareRuns
   ```

4. **Open in VS Code**:
   ```bash
   code .
   ```

5. **Configure Java**:
   - Open Command Palette (Ctrl/Cmd + Shift + P)
   - Type "Java: Configure Workspace" and ensure JDK 8 is selected

6. **Gradle integration**:
   - The Gradle extension will automatically detect the build file
   - Use Ctrl/Cmd + Shift + P → "Gradle: Refresh Dependencies"
   - The `genVsCodeRuns` task will have created run configurations in `.vscode/launch.json`

## Building and Running

### Building the Mod

1. **Clean build** (removes previous build artifacts):
   ```bash
   ./gradlew clean
   ```

2. **Build the mod**:
   ```bash
   ./gradlew build
   ```

3. **Build without running tests** (faster):
   ```bash
   ./gradlew build -x test
   ```

The compiled mod JAR file will be located in `build/libs/` directory.

### Running the Development Environment

#### Client (Minecraft with your mod)

**Using Gradle (all IDEs)**:
```bash
./gradlew runClient
```

**Using IDE Run Configurations**:
- **IntelliJ/Eclipse**: Use the automatically generated "runClient" configuration
- **VS Code**: Use the Gradle task runner to execute `runClient`

The client will launch with:
- Your mod loaded
- Development environment settings
- Mixin hot-swapping enabled
- Debug logging configured

#### Server (Dedicated server with your mod)

**Using Gradle (all IDEs)**:
```bash
./gradlew runServer
```

**Using IDE Run Configurations**:
- **IntelliJ/Eclipse**: Use the automatically generated "runServer" configuration
- **VS Code**: Use the Gradle task runner to execute `runServer`

The server will start with:
- Your mod loaded
- Server-side only features
- Console interface for commands
- Development logging enabled

#### Development Notes

- **Working Directories**: 
  - Client: `run/client/`
  - Server: `run/server/` (created automatically)
- **Mods Directory**: Place additional mods in the respective `run/client/mods/` or `run/server/mods/` directories
- **Logs**: Check `run/client/logs/` or `run/server/logs/` for debugging information
- **Hot-swapping**: Mixin changes can be applied without restarting (limited functionality)

### Gradle Tasks Reference

| Task | Description |
|------|-------------|
| `./gradlew build` | Compile and package the mod |
| `./gradlew runClient` | Run Minecraft client with mod loaded |
| `./gradlew runServer` | Run dedicated server with mod loaded |
| `./gradlew clean` | Remove build artifacts |
| `./gradlew prepareRuns` | Prepare run directories and configurations |
| `./gradlew genIntellijRuns` | Generate IntelliJ IDEA run configurations |
| `./gradlew genEclipseRuns` | Generate Eclipse run configurations |
| `./gradlew genVsCodeRuns` | Generate VS Code run configurations |
| `./gradlew eclipse` | Generate Eclipse project files |
| `./gradlew publishToMavenLocal` | Install mod to local Maven repository |

## Project Configuration

The mod's properties are centralized in `gradle.properties`:

- **mod_version**: Version of your mod
- **mod_id**: Unique identifier for your mod  
- **mod_group**: Maven group ID
- **name**: Display name of the mod
- **description**: Mod description
- **mc_version**: Target Minecraft version (1.12.2)
- **mappings_version**: MCP mappings version

## Project Structure

```
Base/
├── src/main/java/com/Lenvill/
│   ├── Base.java              # Main mod class
│   ├── Config.java            # Configuration handling
│   └── proxy/
│       ├── CommonProxy.java   # Server-side logic
│       └── ClientProxy.java   # Client-side logic
├── src/main/resources/
│   ├── mcmod.info            # Mod metadata
│   ├── pack.mcmeta           # Resource pack metadata
│   └── assets/               # Mod assets (textures, models, etc.)
├── build.gradle              # Build configuration
├── gradle.properties         # Project properties
└── settings.gradle           # Gradle settings
```

## Contributing

This project serves as a template for MineFantasy Reforged addon development. When using this template:

1. Fork the repository
2. Update the mod properties in `gradle.properties`
3. Modify the package structure to match your mod's name
4. Update the mod metadata in `mcmod.info`
5. Begin developing your addon features

## Author
- Originally written by Lenvill, based on MC Forge 1.12.2 SDK
- Readme written by kyyrell

## Support

For issues with this template:
- Check the existing issues in the repository
- Review the MineFantasy Reforged documentation
- Consult the Minecraft Forge 1.12.2 documentation

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details.

This license ensures that:
- You can freely use, modify, and distribute this template
- Any derivative works must also be open source under GPL v3.0
- You must include attribution to the original authors
- No warranty is provided with this software

For more information about the GPL v3.0 license, visit [https://www.gnu.org/licenses/gpl-3.0.html](https://www.gnu.org/licenses/gpl-3.0.html).
