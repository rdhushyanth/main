cmake_minimum_required(VERSION 3.6)

project(ostep)


set(CMAKE_BINARY_DIR ${CMAKE_SOURCE_DIR}/bin)
set(EXECUTABLE_OUTPUT_PATH ${CMAKE_BINARY_DIR})
set(LIBRARY_OUTPUT_PATH ${PROJECT_BINARY_DIR}/lib)
set(HEADER_DIR ${PROJECT_SOURCE_DIR}/src/includes)

include_directories("${PROJECT_SOURCE_DIR}/src")
include_directories("${HEADER_DIR}")
add_executable(cpu ${PROJECT_SOURCE_DIR}/src/cpu2.1.c ${HEADER_DIR}/common.h)
